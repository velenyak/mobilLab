package com.bme.janosvelenyak.mobillab;

import android.app.Application;

/**
 * Created by janosvelenyak on 2018. 05. 25..
 */

public class TestApplication extends Application {

    public static GiphyApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();

        injector = DaggerTestComponent.builder().testModule(new TestModule(this)).build();
    }
}
