package com.bme.janosvelenyak.mobillab.interactor.main;

import com.bme.janosvelenyak.mobillab.GiphyApplication;

/**
 * Created by janosvelenyak on 2018. 05. 03..
 */

public class MainInteractor {

    public MainInteractor() {
        GiphyApplication.injector.inject(this);
    }
}
