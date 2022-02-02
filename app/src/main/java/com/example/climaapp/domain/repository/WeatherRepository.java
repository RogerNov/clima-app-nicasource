package com.example.climaapp.domain.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.climaapp.domain.entities.CurrentWeatherWithWeather;

import java.util.List;

public interface WeatherRepository {
    LiveData<List<CurrentWeatherWithWeather>> getListCurrentWeather();
    MutableLiveData<Boolean> insertCurrentWeather(String cityName);
}
