package com.bme.janosvelenyak.mobillab.interactor.favourites;

import com.bme.janosvelenyak.mobillab.GiphyApplication;
import com.bme.janosvelenyak.mobillab.api.GifsApi;
import com.bme.janosvelenyak.mobillab.interactor.event.GifEvent;
import com.bme.janosvelenyak.mobillab.interactor.main.event.GifsEvent;
import com.bme.janosvelenyak.mobillab.model.InlineResponse200;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2004;
import com.bme.janosvelenyak.mobillab.network.NetworkConfig;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by janosvelenyak on 2018. 05. 03..
 */

public class FavouritesInteractor {

    @Inject
    GifsApi gifsApi;

    public FavouritesInteractor() {
        GiphyApplication.injector.inject(this);
    }

    public void getGifs(List<String> ids) {
        Call<InlineResponse200> gifsQueryCall = gifsApi.gETGifs(strJoin(ids, ","), NetworkConfig.API_KEY);
        GifEvent gifEvent = new GifEvent();
        try {
            Response<InlineResponse200> response = gifsQueryCall.execute();
            if(response.code() != 200) {
                throw new Exception("Result code is not 200: " + response.code());
            }
            gifEvent.setCode(response.code());
            gifEvent.setGifs(response.body().getData());
            EventBus.getDefault().post(gifEvent);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            gifEvent.setThrowable(e);
            EventBus.getDefault().post(gifEvent);
            e.printStackTrace();
        }
    }

    public static String strJoin(List<String> aArr, String sSep) {
        StringBuilder sbStr = new StringBuilder();
        for (int i = 0, il = aArr.size(); i < il; i++) {
            if (i > 0)
                sbStr.append(sSep);
            sbStr.append(aArr.get(i));
        }
        return sbStr.toString();
    }
}
