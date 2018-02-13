package com.ancestor.kotlinJavaLove.weather;

import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by ancestor on 13/02/2018.
 */
public class WeatherEvent {

    private Response response;
    private RetrofitError error;

    public WeatherEvent(Response response) {
        this.response = response;
    }

    public WeatherEvent(RetrofitError error) {
        this.error = error;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public RetrofitError getError() {
        return error;
    }

    public void setError(RetrofitError error) {
        this.error = error;
    }
}
