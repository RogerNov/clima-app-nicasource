package com.example.climaapp.data.datasource.remote;

import com.example.climaapp.domain.entities.CurrentWeather;

public interface CurrentWeatherDataSource {
    CurrentWeather getCurrentWeather(String cityName);
}


