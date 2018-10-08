package com.bme.janosvelenyak.mobillab;

import android.app.Application;

import com.bme.janosvelenyak.mobillab.ui.UIModule;
import com.orm.SugarApp;

/**
 * Created by janosvelenyak on 2018. 04. 20..
 */

public class GiphyApplication extends Application {

    public static GiphyApplicationComponent injector;

    @Override
    public void onCreate() {
        super.onCreate();

        injector =
                DaggerGiphyApplicationComponent.builder().
                        uIModule(
                                new UIModule(this)
                        ).build();
    }
}
