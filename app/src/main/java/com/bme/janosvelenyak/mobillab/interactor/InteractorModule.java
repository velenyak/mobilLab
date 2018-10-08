package com.bme.janosvelenyak.mobillab.interactor;

import com.bme.janosvelenyak.mobillab.interactor.details.DetailsInteractor;
import com.bme.janosvelenyak.mobillab.interactor.favourites.FavouritesInteractor;
import com.bme.janosvelenyak.mobillab.interactor.main.MainInteractor;

import dagger.Module;
import dagger.Provides;

/**
 * Created by janosvelenyak on 2018. 04. 20..
 */

@Module
public class InteractorModule {
    @Provides
    public MainInteractor provideMainInteractor () {return new MainInteractor(); }

    @Provides
    public DetailsInteractor provideDetailsInteractor () { return new DetailsInteractor(); }

    @Provides
    public FavouritesInteractor provideFavouritesInteractor () { return new FavouritesInteractor(); }
}
