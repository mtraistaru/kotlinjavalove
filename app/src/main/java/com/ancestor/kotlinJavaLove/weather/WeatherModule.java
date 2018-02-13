package com.ancestor.kotlinJavaLove.weather;

import com.ancestor.kotlinJavaLove.PageScope;
import com.ancestor.kotlinJavaLove.api.KotlinJavaLoveService;
import com.squareup.otto.Bus;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ancestor on 13/02/2018.
 */
@Module
@PageScope
public class WeatherModule {

    private WeatherContract.View view;

    public WeatherModule(WeatherContract.View view) {
        this.view = view;
    }

    @Provides
    @PageScope
    WeatherContract.Presenter provideWeatherPresenter(WeatherContract.Model model) {
        return new WeatherPresenter(view, model);
    }

    @Provides
    @PageScope
    WeatherContract.Model provideWeatherModel(KotlinJavaLoveService kotlinJavaLoveService, Bus bus) {
        return new WeatherModel(kotlinJavaLoveService, bus);
    }
}
