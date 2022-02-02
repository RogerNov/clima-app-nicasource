package com.example.climaapp.domain.repository;

import androidx.lifecycle.LiveData;

import com.example.climaapp.domain.entities.WeatherForecast;
import com.example.climaapp.domain.entities.WeatherForecastListForecast;

public interface WeatherForecastRepository {
    LiveData<WeatherForecast> getWeatherForecast(String cityName);
/*    LiveData<WeatherForecastListForecast> getLocalWeatherForecast(String cityName);
    void insertWeatherForecast(WeatherForecast weatherForecast);
*/
}
