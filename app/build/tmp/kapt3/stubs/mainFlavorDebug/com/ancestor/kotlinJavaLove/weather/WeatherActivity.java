package com.ancestor.kotlinJavaLove.weather;

import java.lang.System;

/**
 * * Created by ancestor on 13/02/2018.
 */
@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0014J\b\u0010\u0011\u001a\u00020\rH\u0014J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/ancestor/kotlinJavaLove/weather/WeatherActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/ancestor/kotlinJavaLove/weather/WeatherContract$View;", "()V", "presenter", "Lcom/ancestor/kotlinJavaLove/weather/WeatherContract$Presenter;", "getPresenter", "()Lcom/ancestor/kotlinJavaLove/weather/WeatherContract$Presenter;", "setPresenter", "(Lcom/ancestor/kotlinJavaLove/weather/WeatherContract$Presenter;)V", "weatherTextView", "Landroid/widget/TextView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "showWeather", "weather", "", "app_mainFlavorDebug"})
public final class WeatherActivity extends android.support.v7.app.AppCompatActivity implements com.ancestor.kotlinJavaLove.weather.WeatherContract.View {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.ancestor.kotlinJavaLove.weather.WeatherContract.Presenter presenter;
    private android.widget.TextView weatherTextView;
    
    @org.jetbrains.annotations.NotNull()
    public final com.ancestor.kotlinJavaLove.weather.WeatherContract.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.ancestor.kotlinJavaLove.weather.WeatherContract.Presenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void showWeather(@org.jetbrains.annotations.NotNull()
    java.lang.String weather) {
    }
    
    public WeatherActivity() {
        super();
    }
}