package com.bme.janosvelenyak.mobillab.interactor.favourites;

import com.bme.janosvelenyak.mobillab.GiphyApplication;

/**
 * Created by janosvelenyak on 2018. 05. 03..
 */

public class FavouritesInteractor {
    public FavouritesInteractor() {
        GiphyApplication.injector.inject(this);
    }
}
