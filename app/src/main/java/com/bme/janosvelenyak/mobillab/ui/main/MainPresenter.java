package com.bme.janosvelenyak.mobillab.ui.main;

import com.bme.janosvelenyak.mobillab.GiphyApplication;
import com.bme.janosvelenyak.mobillab.di.Network;
import com.bme.janosvelenyak.mobillab.interactor.main.MainInteractor;
import com.bme.janosvelenyak.mobillab.interactor.main.event.GifsEvent;
import com.bme.janosvelenyak.mobillab.ui.Presenter;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.concurrent.Executor;

import javax.inject.Inject;

/**
 * Created by janosvelenyak on 2018. 05. 02..
 */

public class MainPresenter extends Presenter<MainScreen> {

    @Inject
    @Network
    Executor networkExecutor;

    @Inject
    MainInteractor mainInteractor;

    @Override
    public void attachScreen(MainScreen screen) {

        super.attachScreen(screen);
        GiphyApplication.injector.inject(this);
        EventBus.getDefault().register(this);
    }

    @Override
    public void detachScreen() {

        super.detachScreen();
        EventBus.getDefault().unregister(this);

    }

    public void getGifs() {
        networkExecutor.execute(new Runnable() {
            @Override
            public void run() {
                mainInteractor.getGifs();
            }
        });
    }

    public void getGifs(final String search) {
        networkExecutor.execute(new Runnable() {
            @Override
            public void run() {
                mainInteractor.getGifs(search);
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
                screen.showGifs(event.getGifs());
            }
        }
    }

}
