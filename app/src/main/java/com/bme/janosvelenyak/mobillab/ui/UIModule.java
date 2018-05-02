package com.bme.janosvelenyak.mobillab.ui;

import android.content.Context;

import com.bme.janosvelenyak.mobillab.ui.main.MainPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by janosvelenyak on 2018. 04. 20..
 */

@Module
public class UIModule {
    private Context context;

    public UIModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext() {
        return context;
    }

    @Provides
    @Singleton
    public MainPresenter provideMainPresenter() {
        return new MainPresenter();
    }
}
