package com.bme.janosvelenyak.mobillab.mock;

import com.bme.janosvelenyak.mobillab.api.GifsApi;
import com.bme.janosvelenyak.mobillab.model.InlineResponse200;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2001;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2002;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2002Data;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2003;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2004;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2004Pagination;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2005;
import com.bme.janosvelenyak.mobillab.model.InlineResponse200Data;
import com.bme.janosvelenyak.mobillab.model.InlineResponse200Images;
import com.bme.janosvelenyak.mobillab.model.InlineResponse200ImagesOriginal;
import com.bme.janosvelenyak.mobillab.model.InlineResponse200Meta;
import com.bme.janosvelenyak.mobillab.model.InlineResponse200Pagination;
import com.bme.janosvelenyak.mobillab.network.GiphyApi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by janosvelenyak on 2018. 05. 23..
 */

public class MockGifsApi implements GifsApi {
    
    @Override
    public Call<InlineResponse200> gETGifs(String ids, String apiKey) {
        final InlineResponse200 result = new InlineResponse200();

        List<InlineResponse200Data> resultDataList = new ArrayList<>();
        InlineResponse200Data resultData = new InlineResponse200Data();

        String firstId = ids.split(",")[0];

        resultData.setId(firstId);

        InlineResponse200Images img = new InlineResponse200Images();

        InlineResponse200ImagesOriginal original = new InlineResponse200ImagesOriginal();
        original.setUrl("https://media1.giphy.com/media/" + firstId + "/giphy.gif");

        img.setOriginal(original);

        resultDataList.add(resultData);
        result.setData(resultDataList);

        InlineResponse200Pagination pagination = new InlineResponse200Pagination();
        pagination.setCount(1);
        pagination.setOffset(0);
        result.setPagination(pagination);

        InlineResponse200Meta meta = new InlineResponse200Meta();
        meta.setStatus(200);
        meta.setMsg("OK");
        result.setMeta(meta);

        Call<InlineResponse200> call = new Call<InlineResponse200>() {
            @Override
            public Response<InlineResponse200> execute() throws IOException {
                return Response.success(result);
            }

            @Override
            public void enqueue(Callback<InlineResponse200> callback) {

            }

            @Override
            public boolean isExecuted() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public boolean isCanceled() {
                return false;
            }

            @Override
            public Call<InlineResponse200> clone() {
                return null;
            }

            @Override
            public Request request() {
                return null;
            }
        };
        return call;
    }

    @Override
    public Call<InlineResponse2001> gETGifsRandom(String tag, String apiKey) {
        return null;
    }

    @Override
    public Call<InlineResponse2002> gETGifsSearch(String q, Integer limit, Integer offset, String apiKey) {
        final InlineResponse2002 result = new InlineResponse2002();

        List<InlineResponse2002Data> resultDataList = new ArrayList<>();
        InlineResponse2002Data resultData = new InlineResponse2002Data();
        resultData.setType("gif");
        resultData.setId("RQSuZfuylVNAY");
        resultData.setUrl("https://giphy.com/gifs/RQSuZfuylVNAY");

        InlineResponse200Images img = new InlineResponse200Images();

        InlineResponse200ImagesOriginal original = new InlineResponse200ImagesOriginal();
        original.setUrl("https://media0.giphy.com/media/RQSuZfuylVNAY/giphy.gif");

        img.setOriginal(original);

        resultData.setImages(img);

        resultDataList.add(resultData);

        result.setData(resultDataList);

        InlineResponse200Pagination pagination = new InlineResponse200Pagination();
        pagination.setCount(limit);
        pagination.setOffset(offset);
        result.setPagination(pagination);

        InlineResponse200Meta meta = new InlineResponse200Meta();
        meta.setStatus(200);
        meta.setMsg("OK");
        result.setMeta(meta);


        Call<InlineResponse2002> call = new Call<InlineResponse2002>() {
            @Override
            public Response<InlineResponse2002> execute() throws IOException {
                return Response.success(result);
            }

            @Override
            public void enqueue(Callback<InlineResponse2002> callback) {

            }

            @Override
            public boolean isExecuted() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public boolean isCanceled() {
                return false;
            }

            @Override
            public Call<InlineResponse2002> clone() {
                return null;
            }

            @Override
            public Request request() {
                return null;
            }
        };

        return call;
    }

    @Override
    public Call<InlineResponse2003> gETGifsTranslate(String s, String apiKey) {
        return null;
    }

    @Override
    public Call<InlineResponse2004> gETGifsTrending(Integer limit, String apiKey) {
        final InlineResponse2004 result = new InlineResponse2004();

        List<InlineResponse2002Data> resultDataList = new ArrayList<>();
        InlineResponse2002Data resultData = new InlineResponse2002Data();
        resultData.setType("gif");
        resultData.setId("hTAVkhRe2otdvsASiu");
        resultData.setUrl("https://giphy.com/gifs/hTAVkhRe2otdvsASiu");

        InlineResponse200Images img = new InlineResponse200Images();

        InlineResponse200ImagesOriginal original = new InlineResponse200ImagesOriginal();
        original.setUrl("https://media1.giphy.com/media/hTAVkhRe2otdvsASiu/giphy.gif");

        img.setOriginal(original);

        resultData.setImages(img);

        resultDataList.add(resultData);

        result.setData(resultDataList);

        InlineResponse2004Pagination pagination = new InlineResponse2004Pagination();
        pagination.setCount(limit);
        pagination.setOffset(0);
        result.setPagination(pagination);

        InlineResponse200Meta meta = new InlineResponse200Meta();
        meta.setStatus(200);
        meta.setMsg("OK");
        result.setMeta(meta);

        Call<InlineResponse2004> call = new Call<InlineResponse2004>() {
            @Override
            public Response<InlineResponse2004> execute() throws IOException {
                return Response.success(result);
            }

            @Override
            public void enqueue(Callback<InlineResponse2004> callback) {

            }

            @Override
            public boolean isExecuted() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public boolean isCanceled() {
                return false;
            }

            @Override
            public Call<InlineResponse2004> clone() {
                return null;
            }

            @Override
            public Request request() {
                return null;
            }
        };
        return call;
    }

    @Override
    public Call<InlineResponse200> gETGifsGifId(String gifId, String apiKey) {
        final InlineResponse200 result = new InlineResponse200();

        List<InlineResponse200Data> resultDataList = new ArrayList<>();
        InlineResponse200Data resultData = new InlineResponse200Data();

        resultData.setId(gifId);

        InlineResponse200Images img = new InlineResponse200Images();

        InlineResponse200ImagesOriginal original = new InlineResponse200ImagesOriginal();
        original.setUrl("https://media1.giphy.com/media/" + gifId + "/giphy.gif");

        img.setOriginal(original);

        resultDataList.add(resultData);
        result.setData(resultDataList);

        InlineResponse200Pagination pagination = new InlineResponse200Pagination();
        pagination.setCount(1);
        pagination.setOffset(0);
        result.setPagination(pagination);

        InlineResponse200Meta meta = new InlineResponse200Meta();
        meta.setStatus(200);
        meta.setMsg("OK");
        result.setMeta(meta);

        Call<InlineResponse200> call = new Call<InlineResponse200>() {
            @Override
            public Response<InlineResponse200> execute() throws IOException {
                return Response.success(result);
            }

            @Override
            public void enqueue(Callback<InlineResponse200> callback) {

            }

            @Override
            public boolean isExecuted() {
                return false;
            }

            @Override
            public void cancel() {

            }

            @Override
            public boolean isCanceled() {
                return false;
            }

            @Override
            public Call<InlineResponse200> clone() {
                return null;
            }

            @Override
            public Request request() {
                return null;
            }
        };
        return call;
    }
}
