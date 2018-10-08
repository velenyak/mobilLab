package com.bme.janosvelenyak.mobillab.network;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

/**
 * Created by janosvelenyak on 2018. 05. 03..
 */

public interface GiphyApi {
    @GET("search")
    Call getGifs(@Query("api_key") String apiKey,
                 @Query("q") String search,
                 @Query("limit") int limit,
                 @Query("offset") int offset,
                 @Query("rating") String rating,
                 @Query("lang") String lang
    );
}
