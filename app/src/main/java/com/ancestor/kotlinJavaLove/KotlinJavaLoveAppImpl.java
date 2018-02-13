package com.ancestor.kotlinJavaLove;

import android.app.Application;

import com.ancestor.kotlinJavaLove.module.CommonModule;
import com.ancestor.kotlinJavaLove.module.WebserviceModule;
import com.ancestor.kotlinJavaLove.weather.DaggerWeatherComponent;
import com.ancestor.kotlinJavaLove.weather.WeatherComponent;
import com.ancestor.kotlinJavaLove.weather.WeatherContract;
import com.ancestor.kotlinJavaLove.weather.WeatherModule;

/**
 * Created by ancestor on 13/02/2018.
 */
public class KotlinJavaLoveAppImpl extends Application implements KotlinJavaLoveApp {

    KotlinJavaLoveComponent kotlinJavaLoveComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        kotlinJavaLoveComponent = DaggerKotlinJavaLoveComponent
                .builder()
                .commonModule(new CommonModule(this))
                .webserviceModule(new WebserviceModule())
                .build();
    }

    @Override
    public KotlinJavaLoveComponent getKotlinJavaLoveComponent() {
        return kotlinJavaLoveComponent;
    }

    @Override
    public WeatherComponent getWeatherComponent(WeatherContract.View view) {
        return DaggerWeatherComponent.builder()
                .kotlinJavaLoveComponent(kotlinJavaLoveComponent)
                .weatherModule(new WeatherModule(view))
                .build();
    }
}
