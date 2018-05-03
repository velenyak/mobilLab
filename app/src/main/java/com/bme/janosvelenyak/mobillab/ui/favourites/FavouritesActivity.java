package com.bme.janosvelenyak.mobillab.ui.favourites;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bme.janosvelenyak.mobillab.GiphyApplication;
import com.bme.janosvelenyak.mobillab.R;

import javax.inject.Inject;

/**
 * Created by janosvelenyak on 2018. 05. 03..
 */

public class FavouritesActivity extends AppCompatActivity implements FavouritesScreen {

    @Inject
    FavouritesPresenter presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_favourites);

        GiphyApplication.injector.inject(this);
        presenter.attachScreen(this);
    }
}
