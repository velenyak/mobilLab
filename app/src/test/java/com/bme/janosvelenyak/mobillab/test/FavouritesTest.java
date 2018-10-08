package com.bme.janosvelenyak.mobillab.test;

import com.bme.janosvelenyak.mobillab.BuildConfig;
import com.bme.janosvelenyak.mobillab.interactor.favourites.FavouritesInteractor;
import com.bme.janosvelenyak.mobillab.model.InlineResponse200Data;
import com.bme.janosvelenyak.mobillab.ui.favourites.FavouritesPresenter;
import com.bme.janosvelenyak.mobillab.ui.favourites.FavouritesScreen;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.ArrayList;
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
public class FavouritesTest {

    private FavouritesPresenter presenter;
    private FavouritesScreen screen;

    @Before
    public void setup() {
        setTestInjector();
        screen = mock(FavouritesScreen.class);
        presenter = new FavouritesPresenter();
        presenter.attachScreen(screen);
    }

    @Test
    public void getGifsByIdTest() {
        List<String> ids = new ArrayList<>();
        ids.add("wjK3YnjoQf0go");
        ids.add("fpXxIjftmkk9y");

        presenter.getGifs(ids);

        ArgumentCaptor<List> gifCaptor = ArgumentCaptor.forClass(List.class);
        verify(screen).showGifs(gifCaptor.capture());
        InlineResponse200Data data = (InlineResponse200Data)gifCaptor.getValue().get(0);
        assertTrue(gifCaptor.getValue().size() > 0);
        assertEquals("wjK3YnjoQf0go", data.getId());
        assertEquals("https://media0.giphy.com/media/" + "wjK3YnjoQf0go" + "/giphy.gif", data.getImages().getOriginal().getUrl());
    }

    @Test
    public void JoinStringTest() {
        List<String> strList = new ArrayList<>();
        strList.add("ID-1");
        strList.add("some_id_anvo");
        strList.add(" id with spaces");

        String res = FavouritesInteractor.strJoin(strList, ",");
        assertEquals("ID-1,some_id_anvo, id with spaces", res);
    }
}
