package com.example.climaapp.data.datasource.remote;

import androidx.lifecycle.LiveData;

import com.example.climaapp.domain.entities.CurrentWeather;

public interface CurrentWeatherDataSource {
    LiveData<CurrentWeather> getCurrentWeather(String cityName);
}


