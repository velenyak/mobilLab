package com.bme.janosvelenyak.mobillab.test;

import com.bme.janosvelenyak.mobillab.BuildConfig;
import com.bme.janosvelenyak.mobillab.model.InlineResponse200Data;
import com.bme.janosvelenyak.mobillab.ui.details.DetailsPresenter;
import com.bme.janosvelenyak.mobillab.ui.details.DetailsScreen;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.List;

import static com.bme.janosvelenyak.mobillab.TestHelper.setTestInjector;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by janosvelenyak on 2018. 05. 25..
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class DetailsTest {

    private DetailsPresenter presenter;
    private DetailsScreen screen;

    @Before
    public void setup() {
        setTestInjector();
        screen = mock(DetailsScreen.class);
        presenter = new DetailsPresenter();
        presenter.attachScreen(screen);
    }

    @Test
    public void gifByIdTest() {
        presenter.getGif("51Uiuy5QBZNkoF3b2Z");

        ArgumentCaptor<List> gifCaptor = ArgumentCaptor.forClass(List.class);
        verify(screen).showGif(gifCaptor.capture());
        InlineResponse200Data data = (InlineResponse200Data)gifCaptor.getValue().get(0);
        assertTrue(gifCaptor.getValue().size() == 1);
        assertEquals("51Uiuy5QBZNkoF3b2Z", data.getId());
        assertEquals("https://media0.giphy.com/media/" + "51Uiuy5QBZNkoF3b2Z" + "/giphy.gif", data.getImages().getOriginal().getUrl());
    }
}
