package com.ancestor.kotlinJavaLove.weather;

/**
 * Created by ancestor on 13/02/2018.
 */

public interface WeatherContract {

    interface Model {

        void setup();

        void tearDown();

        void getLondonWeather();

        void getCairnWeather();
    }

    interface View {

        void showWeather(String weather);
    }

    interface Presenter {

        void londonClicked();

        void cairnClicked();

        void onResume();

        void onPause();
    }

    interface Callback {
        void onWeatherEvent(WeatherEvent weatherEvent);
    }
}
