package com.bme.janosvelenyak.mobillab;

import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowLog;

/**
 * Created by janosvelenyak on 2018. 05. 23..
 */

public class TestHelper {

    public static void setTestInjector() {
        ShadowLog.stream = System.out;
        GiphyApplication application = (GiphyApplication) RuntimeEnvironment.application;
        GiphyApplicationComponent injector = DaggerTestComponent.builder().testModule(new TestModule(application.getApplicationContext())).build();
        application.injector = injector;
    }
}
