package com.bme.janosvelenyak.mobillab.ui.details;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bme.janosvelenyak.mobillab.GiphyApplication;
import com.bme.janosvelenyak.mobillab.R;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2002Data;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by janosvelenyak on 2018. 05. 03..
 */

public class DetailsActivity extends AppCompatActivity implements DetailsScreen {

    @Inject
    DetailsPresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        GiphyApplication.injector.inject(this);
        presenter.attachScreen(this);
    }

    @Override
    public void showGif(List<InlineResponse2002Data> gifs) {

    }
}
