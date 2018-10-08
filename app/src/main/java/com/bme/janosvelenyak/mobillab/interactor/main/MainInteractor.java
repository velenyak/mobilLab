package com.bme.janosvelenyak.mobillab.interactor.main;

import com.bme.janosvelenyak.mobillab.GiphyApplication;
import com.bme.janosvelenyak.mobillab.api.GifsApi;
import com.bme.janosvelenyak.mobillab.interactor.main.event.GifsEvent;
import com.bme.janosvelenyak.mobillab.model.InlineResponse200;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2002;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2004;
import com.bme.janosvelenyak.mobillab.model.InlineResponse200Data;
import com.bme.janosvelenyak.mobillab.network.NetworkConfig;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by janosvelenyak on 2018. 05. 03..
 */

public class MainInteractor {

    @Inject
    GifsApi gifsApi;

    public MainInteractor() {
        GiphyApplication.injector.inject(this);
    }

    public void getGifs() {
        Call<InlineResponse2004> gifsQueryCall = gifsApi.gETGifsTrending(25, NetworkConfig.API_KEY);
        GifsEvent gifsEvent = new GifsEvent();
        try {
            Response<InlineResponse2004> response = gifsQueryCall.execute();
            if(response.code() != 200) {
                throw new Exception("Result code is not 200: " + response.code());
            }
            gifsEvent.setCode(response.code());
            gifsEvent.setGifs(response.body().getData());
            EventBus.getDefault().post(gifsEvent);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            gifsEvent.setThrowable(e);
            EventBus.getDefault().post(gifsEvent);
            e.printStackTrace();
        }
    }

    public void getGifs(String search) {
        Call<InlineResponse2002> gifsQueryCall = gifsApi.gETGifsSearch(search, 25, 0, NetworkConfig.API_KEY);
        GifsEvent gifsEvent = new GifsEvent();
        try {
            Response<InlineResponse2002> response = gifsQueryCall.execute();
            if(response.code() != 200) {
                throw new Exception("Result code is not 200: " + response.code());
            }
            gifsEvent.setCode(response.code());
            gifsEvent.setGifs(response.body().getData());
            EventBus.getDefault().post(gifsEvent);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            gifsEvent.setThrowable(e);
            EventBus.getDefault().post(gifsEvent);
            e.printStackTrace();
        }
    }

}
