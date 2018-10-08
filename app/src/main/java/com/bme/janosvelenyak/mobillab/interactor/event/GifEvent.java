package com.bme.janosvelenyak.mobillab.interactor.event;

import com.bme.janosvelenyak.mobillab.model.InlineResponse2002Data;
import com.bme.janosvelenyak.mobillab.model.InlineResponse200Data;

import java.util.List;

/**
 * Created by janosvelenyak on 2018. 05. 25..
 */

public class GifEvent {

    private int code;
    private List<InlineResponse200Data> gifs;
    private Throwable throwable;

    //<editor-fold desc="Constructors|Getters|Setters">

    public GifEvent() {
    }

    public GifEvent(int code, List<InlineResponse200Data> gifs, Throwable throwable) {
        this.code = code;
        this.gifs = gifs;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<InlineResponse200Data> getGifs() {
        return gifs;
    }

    public void setGifs(List<InlineResponse200Data> gifs) {
        this.gifs = gifs;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}