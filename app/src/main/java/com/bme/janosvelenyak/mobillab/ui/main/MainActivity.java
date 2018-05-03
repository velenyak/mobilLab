package com.bme.janosvelenyak.mobillab.ui.main;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bme.janosvelenyak.mobillab.GiphyApplication;
import com.bme.janosvelenyak.mobillab.R;

import javax.inject.Inject;

import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by janosvelenyak on 2018. 04. 20..
 */

public class MainActivity extends AppCompatActivity implements MainScreen {

    @Inject
    MainPresenter mainPresenter;

    @BindString(R.string.app_name) String test = "TEST";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        GiphyApplication.injector.inject(this);
        mainPresenter.attachScreen(this);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
//        mainPresenter.detachScreen();
    }

    @OnClick(R.id.testBtn)
    public void onButtonClicked() {
        test = "CLICKED";
    }
}
