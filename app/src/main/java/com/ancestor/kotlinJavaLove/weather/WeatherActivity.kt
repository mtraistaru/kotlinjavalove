package com.ancestor.kotlinJavaLove.weather

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

import com.ancestor.kotlinJavaLove.R
import com.ancestor.kotlinJavaLove.KotlinJavaLoveApp

import javax.inject.Inject

/**
 * Created by ancestor on 13/02/2018.
 */

class WeatherActivity : AppCompatActivity(), WeatherContract.View {

    @Inject lateinit var presenter: WeatherContract.Presenter

    private var weatherTextView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val weatherComponent = (application as KotlinJavaLoveApp).getWeatherComponent(this)
        weatherComponent.inject(this)
        setContentView(R.layout.activity_weather)
        weatherTextView = findViewById(R.id.weather)
        findViewById<View>(R.id.getLondonWeatherBtn).setOnClickListener { presenter.londonClicked() }
        findViewById<View>(R.id.getCairnWeatherBtn).setOnClickListener { presenter.cairnClicked() }
    }

    override fun onPause() {
        super.onPause()
        presenter.onPause()
    }

    override fun onResume() {
        super.onResume()
        presenter.onResume()
    }

    override fun showWeather(weather: String) {
        if (weatherTextView != null) {
            weatherTextView!!.text = weather
        }
    }
}
