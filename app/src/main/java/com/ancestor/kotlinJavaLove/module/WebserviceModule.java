package com.ancestor.kotlinJavaLove.module;

import android.content.Context;

import com.ancestor.kotlinJavaLove.Constants;
import com.ancestor.kotlinJavaLove.api.KotlinJavaLoveEndpoint;
import com.ancestor.kotlinJavaLove.api.KotlinJavaLoveService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.OkHttpClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.converter.GsonConverter;

/**
 * Created by ancestor on 13/02/2018.
 */
@Module
public class WebserviceModule {

    @Singleton
    @Provides
    KotlinJavaLoveEndpoint provideKotlinJavaLoveEndpoint(RestAdapter restAdapter) {
        return restAdapter.create(KotlinJavaLoveEndpoint.class);
    }

    @Singleton
    @Provides
    RestAdapter provideKotlinJavaLoveRestAdapter(OkClient client, RequestInterceptor requestInterceptor, Gson gson) {
        return new RestAdapter.Builder()
                .setClient(client)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(Constants.ENDPOINT)
                .setRequestInterceptor(requestInterceptor)
                .setConverter(new GsonConverter(gson))
                .build();
    }

    @Singleton
    @Provides
    KotlinJavaLoveService provideKotlinJavaLoveService(Context context) {
        return new KotlinJavaLoveService(context);
    }

    @Singleton
    @Provides
    Gson provideGson() {
        return new GsonBuilder().create();
    }

    @Singleton
    @Provides
    OkClient provideClient() {
        return new OkClient(new OkHttpClient());
    }

    @Singleton
    @Provides
    RequestInterceptor provideRequestInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void intercept(RequestFacade request) {
                request.addHeader("Accept", "application/json");
                request.addHeader("Content-Type", "application/json");
            }
        };
    }
}