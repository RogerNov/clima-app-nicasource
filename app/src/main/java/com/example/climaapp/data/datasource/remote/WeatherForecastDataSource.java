package com.example.climaapp.data.datasource.remote;

import androidx.lifecycle.LiveData;

import com.example.climaapp.domain.entities.WeatherForecast;

public interface WeatherForecastDataSource {
    LiveData<WeatherForecast> getWeatherForeCast(String cityName);
}
