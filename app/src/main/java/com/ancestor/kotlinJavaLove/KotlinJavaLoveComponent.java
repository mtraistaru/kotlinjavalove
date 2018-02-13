package com.ancestor.kotlinJavaLove;

import com.ancestor.kotlinJavaLove.api.KotlinJavaLoveService;
import com.ancestor.kotlinJavaLove.module.CommonModule;
import com.ancestor.kotlinJavaLove.module.WebserviceModule;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ancestor on 13/02/2018.
 */
@Singleton
@Component(modules = {CommonModule.class, WebserviceModule.class})
public interface KotlinJavaLoveComponent {

    KotlinJavaLoveService getSpineMonitorService();

    Bus getBus();

    void inject(KotlinJavaLoveService kotlinJavaLoveService);
}
