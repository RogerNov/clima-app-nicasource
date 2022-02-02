package com.example.climaapp.data.datasource.local;

import androidx.lifecycle.LiveData;

import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.CurrentWeatherWithWeather;

import java.util.List;

public interface  CurrentWeatherLocalDataSource{
    void insertCurrentWeather(CurrentWeather currentWeather);
    LiveData<List<CurrentWeatherWithWeather>> getCurrentWeathers();
    CurrentWeather getCurrentWeather(String name);
    void deleteCurrentWeather(CurrentWeather currentWeather);
}