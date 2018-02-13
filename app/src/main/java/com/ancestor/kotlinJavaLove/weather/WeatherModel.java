package com.ancestor.kotlinJavaLove.weather;

import com.ancestor.kotlinJavaLove.api.KotlinJavaLoveService;
import com.squareup.otto.Bus;
import com.squareup.otto.Subscribe;

/**
 * Created by ancestor on 13/02/2018.
 */

public class WeatherModel implements WeatherContract.Model {

    private KotlinJavaLoveService kotlinJavaLoveService;
    private Bus bus;

    public WeatherModel(KotlinJavaLoveService kotlinJavaLoveService, Bus bus) {
        this.kotlinJavaLoveService = kotlinJavaLoveService;
        this.bus = bus;
    }

    private WeatherContract.Callback callback;

    void setCallback(WeatherContract.Callback callback) {
        this.callback = callback;
    }

    @Override
    public void setup() {
        bus.register(this);
    }

    @Override
    public void tearDown() {
        bus.unregister(this);
    }

    @Override
    public void getLondonWeather() {
        kotlinJavaLoveService.getLondonWeather();
    }

    @Override
    public void getCairnWeather() {
        kotlinJavaLoveService.getCairnWeather();
    }

    @Subscribe
    public void onWeatherEvent(WeatherEvent weatherEvent) {
        callback.onWeatherEvent(weatherEvent);
    }
}
