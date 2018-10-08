package com.bme.janosvelenyak.mobillab.mock;

import com.bme.janosvelenyak.mobillab.api.GifsApi;
import com.bme.janosvelenyak.mobillab.network.NetworkConfig;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by janosvelenyak on 2018. 05. 23..
 */

@Module
public class MockNetworkModule {

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
        return new MockGifsApi();
    }
}
