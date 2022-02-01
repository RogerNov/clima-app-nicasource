package com.example.climaapp.domain.repository;

import androidx.lifecycle.LiveData;

import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.CurrentWeatherWithWeather;

import java.util.List;

public interface WeatherRepository {
    LiveData<CurrentWeather> getCurrentWeather(String cityName);
    LiveData<CurrentWeather> getCurrentWeatherLocal(String cityName);
    LiveData<List<CurrentWeatherWithWeather>> getListCurrentWeather();
    void insertCurrentWeather(CurrentWeather weather);
}
