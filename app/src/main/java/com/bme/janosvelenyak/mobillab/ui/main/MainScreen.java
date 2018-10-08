package com.bme.janosvelenyak.mobillab.ui.main;

import com.bme.janosvelenyak.mobillab.model.InlineResponse200;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2002Data;

import java.util.List;

/**
 * Created by janosvelenyak on 2018. 04. 20..
 */

public interface MainScreen {
    void showGifs(List<InlineResponse2002Data> gifs);
}
