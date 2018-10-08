package com.bme.janosvelenyak.mobillab.ui.favourites;

import com.bme.janosvelenyak.mobillab.model.InlineResponse200Data;

import java.util.List;

/**
 * Created by janosvelenyak on 2018. 05. 03..
 */

public interface FavouritesScreen {
    void showGifs(List<InlineResponse200Data> gifs);
}
