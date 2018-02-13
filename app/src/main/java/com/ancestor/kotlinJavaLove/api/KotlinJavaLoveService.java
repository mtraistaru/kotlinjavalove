package com.ancestor.kotlinJavaLove.api;

import android.content.Context;

import com.ancestor.kotlinJavaLove.KotlinJavaLoveApp;
import com.ancestor.kotlinJavaLove.weather.WeatherEvent;
import com.squareup.otto.Bus;

import javax.inject.Inject;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by ancestor on 13/02/2018.
 */
public class KotlinJavaLoveService {

    @Inject
    KotlinJavaLoveEndpoint kotlinJavaLoveEndpoint;

    @Inject
    Bus bus;

    public KotlinJavaLoveService(Context context) {
        ((KotlinJavaLoveApp) context.getApplicationContext()).getKotlinJavaLoveComponent().inject(this);
    }

    public void getLondonWeather() {
        kotlinJavaLoveEndpoint.getLondonWeather(new Callback<Response>() {
            @Override
            public void success(Response response, Response response2) {
                bus.post(new WeatherEvent(response));
            }

            @Override
            public void failure(RetrofitError error) {
                bus.post(new WeatherEvent(error));
            }
        });
    }

    public void getCairnWeather() {
        kotlinJavaLoveEndpoint.getCairnWeather(new Callback<Response>() {
            @Override
            public void success(Response response, Response response2) {
                bus.post(new WeatherEvent(response));
            }

            @Override
            public void failure(RetrofitError error) {
                bus.post(new WeatherEvent(error));
            }
        });
    }
}
