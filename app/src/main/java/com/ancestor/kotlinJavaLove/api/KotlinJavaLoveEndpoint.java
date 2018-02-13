package com.ancestor.kotlinJavaLove.api;

import retrofit.Callback;
import retrofit.client.Response;
import retrofit.http.GET;

/**
 * Created by ancestor on 13/02/2018.
 */
public interface KotlinJavaLoveEndpoint {

    @GET("/weather?q=London&appid=b6907d289e10d714a6e88b30761fae22")
    void getLondonWeather(Callback<Response> callback);

    @GET("/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22")
    void getCairnWeather(Callback<Response> callback);
}
