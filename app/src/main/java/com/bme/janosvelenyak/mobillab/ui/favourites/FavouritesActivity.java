package com.bme.janosvelenyak.mobillab.ui.favourites;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bme.janosvelenyak.mobillab.GiphyApplication;
import com.bme.janosvelenyak.mobillab.R;
import com.bme.janosvelenyak.mobillab.model.InlineResponse200Data;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by janosvelenyak on 2018. 05. 03..
 */

public class FavouritesActivity extends AppCompatActivity implements FavouritesScreen {

    @Inject
    FavouritesPresenter presenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);

        GiphyApplication.injector.inject(this);
        presenter.attachScreen(this);
    }

    @Override
    public void showGifs(List<InlineResponse200Data> gifs) {

    }
}
