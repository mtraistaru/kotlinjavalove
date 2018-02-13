package com.ancestor.kotlinJavaLove.weather;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.Calendar;

/**
 * Created by ancestor on 13/02/2018.
 */

public class WeatherPresenter implements WeatherContract.Presenter, WeatherContract.Callback {

    private WeatherContract.View view;
    private WeatherContract.Model model;

    WeatherPresenter(WeatherContract.View view, WeatherContract.Model model) {
        this.view = view;
        this.model = model;
        ((WeatherModel) model).setCallback(this);
    }

    @Override
    public void onWeatherEvent(WeatherEvent weatherEvent) {
        view.showWeather(weatherEvent.getError() != null ? Status.ERROR.getValue() : new Gson().toJson(weatherEvent.getResponse()));
    }

    @Override
    public void londonClicked() {
        model.getLondonWeather();
    }

    @Override
    public void cairnClicked() {
        model.getCairnWeather();
    }

    @Override
    public void onResume() {
        model.setup();
    }

    @Override
    public void onPause() {
        model.tearDown();
    }

    private enum Status {
        ERROR("Error");

        private String value;

        Status(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
