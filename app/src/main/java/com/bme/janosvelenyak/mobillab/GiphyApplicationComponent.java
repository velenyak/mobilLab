package com.bme.janosvelenyak.mobillab;

import com.bme.janosvelenyak.mobillab.interactor.InteractorModule;
import com.bme.janosvelenyak.mobillab.network.NetworkModule;
import com.bme.janosvelenyak.mobillab.ui.UIModule;
import com.bme.janosvelenyak.mobillab.ui.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by janosvelenyak on 2018. 04. 20..
 */

@Singleton
@Component(modules = {UIModule.class, NetworkModule.class,
        InteractorModule.class})
public interface GiphyApplicationComponent {
    void inject(MainActivity mainActivity);

}
