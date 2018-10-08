package com.bme.janosvelenyak.mobillab.ui.favourites;

import com.bme.janosvelenyak.mobillab.GiphyApplication;
import com.bme.janosvelenyak.mobillab.di.Network;
import com.bme.janosvelenyak.mobillab.interactor.event.GifEvent;
import com.bme.janosvelenyak.mobillab.interactor.favourites.FavouritesInteractor;
import com.bme.janosvelenyak.mobillab.interactor.main.event.GifsEvent;
import com.bme.janosvelenyak.mobillab.ui.Presenter;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.List;
import java.util.concurrent.Executor;

import javax.inject.Inject;

/**
 * Created by janosvelenyak on 2018. 05. 03..
 */

public class FavouritesPresenter extends Presenter<FavouritesScreen> {

    @Inject
    @Network
    Executor networkExecutor;

    @Inject
    FavouritesInteractor favouritesInteractor;

    @Override
    public void attachScreen(FavouritesScreen screen) {
        super.attachScreen(screen);
        GiphyApplication.injector.inject(this);
        EventBus.getDefault().register(this);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
        EventBus.getDefault().unregister(this);
    }

    public void getGifs(final List<String> ids) {
        networkExecutor.execute(new Runnable() {
            @Override
            public void run() {
                favouritesInteractor.getGifs(ids);
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(final GifEvent event) {
        if (event.getThrowable() != null) {
            event.getThrowable().printStackTrace();
            if (screen != null) {
            }
        } else {
            if (screen != null) {
                screen.showGifs(event.getGifs());
            }
        }
    }
}
