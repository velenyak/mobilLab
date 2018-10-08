package com.bme.janosvelenyak.mobillab.interactor.main.event;

import com.bme.janosvelenyak.mobillab.model.InlineResponse200;
import com.bme.janosvelenyak.mobillab.model.InlineResponse2002Data;

import java.util.List;

public class GifsEvent {

    private int code;
    private List<InlineResponse2002Data> gifs;
    private Throwable throwable;

    //<editor-fold desc="Constructors|Getters|Setters">

    public GifsEvent() {
    }

    public GifsEvent(int code, List<InlineResponse2002Data> gifs, Throwable throwable) {
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

    public List<InlineResponse2002Data> getGifs() {
        return gifs;
    }

    public void setGifs(List<InlineResponse2002Data> gifs) {
        this.gifs = gifs;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}