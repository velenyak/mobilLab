package com.bme.janosvelenyak.mobillab.network;

import com.bme.janosvelenyak.mobillab.api.GifsApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by janosvelenyak on 2018. 04. 20..
 */

@Module
public class NetworkModule {
    @Provides
    @Singleton
    public Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(NetworkConfig.ENDPOINT_ADDRESS)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

    @Provides
    @Singleton
    public GifsApi provideGifsApi(Retrofit retrofitBuilder) {
        return retrofitBuilder.create(GifsApi.class);
    }
}
