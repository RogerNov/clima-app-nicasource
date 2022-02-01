package com.example.climaapp.data.datasource.local;

import androidx.lifecycle.LiveData;

import com.example.climaapp.domain.entities.WeatherForecast;

public interface WeatherForecastLocalDataSource {
    void insertWeatherForecast(WeatherForecast weatherForecast);
    LiveData<WeatherForecast> getWeatherForecast(String cityName);
}
