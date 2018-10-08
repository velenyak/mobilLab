package com.bme.janosvelenyak.mobillab;

import android.content.Context;

import com.bme.janosvelenyak.mobillab.di.Network;
import com.bme.janosvelenyak.mobillab.ui.details.DetailsPresenter;
import com.bme.janosvelenyak.mobillab.ui.favourites.FavouritesPresenter;
import com.bme.janosvelenyak.mobillab.ui.main.MainPresenter;
import com.bme.janosvelenyak.mobillab.utils.UiExecutor;

import java.util.concurrent.Executor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by janosvelenyak on 2018. 05. 23..
 */

@Module
public class TestModule {

    private Context context;

    public TestModule(Context context) { this.context = context; }

    @Provides
    public Context provideContext() { return this.context; }

    @Provides
    @Singleton
    public MainPresenter provideMainPresenter() {
        return new MainPresenter();
    }

    @Provides
    @Singleton
    public FavouritesPresenter provideFavouritesPresenter() {
        return new FavouritesPresenter();
    }

    @Provides
    @Singleton
    public DetailsPresenter provideDetailsPresenter() {
        return new DetailsPresenter();
    }

    @Provides
    @Singleton
    @Network
    public Executor provideNetworkExecutor() { return new UiExecutor(); }
}
