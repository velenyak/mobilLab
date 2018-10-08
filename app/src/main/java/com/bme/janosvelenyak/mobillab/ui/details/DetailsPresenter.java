package com.bme.janosvelenyak.mobillab.ui.details;

import com.bme.janosvelenyak.mobillab.GiphyApplication;
import com.bme.janosvelenyak.mobillab.di.Network;
import com.bme.janosvelenyak.mobillab.interactor.details.DetailsInteractor;
import com.bme.janosvelenyak.mobillab.interactor.main.event.GifsEvent;
import com.bme.janosvelenyak.mobillab.ui.Presenter;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.concurrent.Executor;

import javax.inject.Inject;

/**
 * Created by janosvelenyak on 2018. 05. 03..
 */

public class DetailsPresenter extends Presenter<DetailsScreen> {

    @Inject
    @Network
    Executor networkExecutor;

    @Inject
    DetailsInteractor detailsInteractor;

    @Override
    public void attachScreen(DetailsScreen screen) {
        super.attachScreen(screen);
        GiphyApplication.injector.inject(this);
        EventBus.getDefault().register(this);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
        EventBus.getDefault().unregister(this);
    }

    public void getGif(final String id) {
        networkExecutor.execute(new Runnable() {
            @Override
            public void run() {
                detailsInteractor.getGifDetails(id);
            }
        });
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(final GifsEvent event) {
        if (event.getThrowable() != null) {
            event.getThrowable().printStackTrace();
            if (screen != null) {
            }
        } else {
            if (screen != null) {
                screen.showGif(event.getGifs());
            }
        }
    }
}
