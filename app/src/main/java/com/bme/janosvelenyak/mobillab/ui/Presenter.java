package com.bme.janosvelenyak.mobillab.ui;

/**
 * Created by janosvelenyak on 2018. 05. 02..
 */

public abstract class Presenter<S> {
    protected S screen;

    public void attachScreen(S screen) {
        this.screen = screen;
    }

    public void detachScreen() {
        this.screen = null;
    }
}
