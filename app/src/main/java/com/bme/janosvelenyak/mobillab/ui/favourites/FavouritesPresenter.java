package com.bme.janosvelenyak.mobillab.ui.favourites;

import com.bme.janosvelenyak.mobillab.ui.Presenter;

import javax.inject.Inject;

/**
 * Created by janosvelenyak on 2018. 05. 03..
 */

public class FavouritesPresenter extends Presenter<FavouritesScreen> {

    @Inject
    public FavouritesPresenter() {

    }

    @Override
    public void attachScreen(FavouritesScreen screen) { super.attachScreen(screen); }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }
}
