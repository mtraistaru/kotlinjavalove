package com.ancestor.kotlinJavaLove;

import com.ancestor.kotlinJavaLove.weather.WeatherComponent;
import com.ancestor.kotlinJavaLove.weather.WeatherContract;

/**
 * Created by ancestor on 13/02/2018.
 */

public interface KotlinJavaLoveApp {

    KotlinJavaLoveComponent getKotlinJavaLoveComponent();

    WeatherComponent getWeatherComponent(WeatherContract.View view);
}
