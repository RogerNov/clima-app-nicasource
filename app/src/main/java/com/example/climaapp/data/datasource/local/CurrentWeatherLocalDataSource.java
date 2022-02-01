package com.example.climaapp.data.datasource.local;

import androidx.lifecycle.LiveData;

import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.CurrentWeatherWithWeather;
import com.example.climaapp.domain.entities.Weather;

import java.util.List;

public interface  CurrentWeatherLocalDataSource{
    void insertCurrentWeather(CurrentWeather currentWeather);
    LiveData<List<CurrentWeatherWithWeather>> getCurrentWeathers();
    LiveData<CurrentWeather> getCurrentWeather(String name);
}