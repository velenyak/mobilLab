package com.bme.janosvelenyak.mobillab;

import com.bme.janosvelenyak.mobillab.interactor.InteractorModule;
import com.bme.janosvelenyak.mobillab.mock.MockNetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by janosvelenyak on 2018. 05. 23..
 */

@Singleton
@Component(modules = {MockNetworkModule.class, TestModule.class, InteractorModule.class})
public interface TestComponent extends GiphyApplicationComponent {
}
