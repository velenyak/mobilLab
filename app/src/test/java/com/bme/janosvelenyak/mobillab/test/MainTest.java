package com.bme.janosvelenyak.mobillab.test;

import android.app.Application;
import android.util.Log;

import com.bme.janosvelenyak.mobillab.BuildConfig;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2002Data;
import com.bme.janosvelenyak.mobillab.ui.main.MainPresenter;
import com.bme.janosvelenyak.mobillab.ui.main.MainScreen;
//import com.orm.SugarApp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.TestLifecycleApplication;
import org.robolectric.annotation.Config;

import java.lang.reflect.Method;
import java.util.List;

import static com.bme.janosvelenyak.mobillab.TestHelper.setTestInjector;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by janosvelenyak on 2018. 05. 23..
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainTest {

    private MainPresenter mainPresenter;
    private MainScreen mainScreen;

    @Before
    public void setup() {
        setTestInjector();
        mainScreen = mock(MainScreen.class);
        mainPresenter = new MainPresenter();
        mainPresenter.attachScreen(mainScreen);
    }

    @Test
    public void trendingTest() {
        mainPresenter.getGifs();

        ArgumentCaptor<List> gifCaptor = ArgumentCaptor.forClass(List.class);
        verify(mainScreen).showGifs(gifCaptor.capture());
        assertTrue(gifCaptor.getValue().size() > 0);
    }

    @Test
    public void searchTest() {
        String search = "dog";

        mainPresenter.getGifs(search);
        ArgumentCaptor<List> gifCaptor = ArgumentCaptor.forClass(List.class);
        verify(mainScreen).showGifs(gifCaptor.capture());
        InlineResponse2002Data data = (InlineResponse2002Data) gifCaptor.getValue().get(0);
        String dataUrl = data.getImages().getOriginal().getUrl();
        assertTrue(gifCaptor.getValue().size() > 0);
        assertEquals(dataUrl, "https://media0.giphy.com/media/RQSuZfuylVNAY/giphy.gif");
    }

}
