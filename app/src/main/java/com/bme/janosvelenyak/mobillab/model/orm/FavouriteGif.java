package com.bme.janosvelenyak.mobillab.model.orm;

import com.orm.SugarRecord;

/**
 * Created by janosvelenyak on 2018. 05. 25..
 */

public class FavouriteGif extends SugarRecord<FavouriteGif> {

    String id;
    String url;
    String gifUrl;

    public FavouriteGif() {
    }

    public FavouriteGif(String id, String url, String gifUrl) {
        this.id = id;
        this.url = url;
        this.gifUrl = gifUrl;
    }
}
