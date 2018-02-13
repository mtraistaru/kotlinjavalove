package com.ancestor.kotlinJavaLove.weather;

import com.ancestor.kotlinJavaLove.KotlinJavaLoveComponent;
import com.ancestor.kotlinJavaLove.PageScope;

import dagger.Component;

/**
 * Created by ancestor on 13/02/2018.
 */
@PageScope
@Component(dependencies = KotlinJavaLoveComponent.class, modules = WeatherModule.class)
public interface WeatherComponent {

    void inject(WeatherActivity weatherActivity);
}
