package com.bme.janosvelenyak.mobillab.ui.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.bme.janosvelenyak.mobillab.GiphyApplication;
import com.bme.janosvelenyak.mobillab.R;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2002Data;
import com.bme.janosvelenyak.mobillab.model.orm.FavouriteGif;
import com.crashlytics.android.Crashlytics;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindString;
import io.fabric.sdk.android.Fabric;

/**
 * Created by janosvelenyak on 2018. 04. 20..
 */

public class MainActivity extends AppCompatActivity implements MainScreen {

    @Inject
    MainPresenter mainPresenter;
    private EditText search;
    private List<InlineResponse2002Data> gifList;
    private RecyclerViewAdapter recyclerViewAdapter;

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        GiphyApplication.injector.inject(this);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.gifsList);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);

        gifList = new ArrayList<>();
        recyclerViewAdapter = new RecyclerViewAdapter(getApplicationContext(), gifList, new RecyclerViewAdapter.ViewHolder.ClickHandler() {
            @Override
            public void onBtnClicked(int position) {
                InlineResponse2002Data data = gifList.get(position);
                if (data != null) {
                    FavouriteGif fav = new FavouriteGif(data.getId(), data.getUrl(), data.getImages().getOriginal().getUrl());
                    fav.save();
                }
            }
        });
        recyclerView.setAdapter(recyclerViewAdapter);

        search = (EditText) findViewById(R.id.searchQuery);

        final Button searchBtn = findViewById(R.id.searchBtn);
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.getGifs(search.getText().toString());

                Bundle b = new Bundle();
                b.putString(FirebaseAnalytics.Param.SEARCH_TERM, search.getText().toString());
                mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SEARCH, b);
            }
        });

        Fabric.with(this, new Crashlytics());

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    }

    public void forceCrash(View view) {
        throw new RuntimeException("This is a crash");
    }


    @Override
    protected void onStart() {
        super.onStart();
        mainPresenter.attachScreen(this);
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.APP_OPEN, new Bundle());

        mainPresenter.getGifs();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mainPresenter.detachScreen();
    }

    @Override
    public void showGifs(List<InlineResponse2002Data> gifs) {
        gifList.clear();
        gifList.addAll(gifs);

        recyclerViewAdapter.notifyDataSetChanged();
    }
}
