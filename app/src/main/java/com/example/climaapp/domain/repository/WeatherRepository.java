package com.example.climaapp.domain.repository;

import com.example.climaapp.domain.entities.CurrentWeather;

import java.util.List;

public interface WeatherRepository {
    CurrentWeather getCurrentWeather(String cityName);
    List<CurrentWeather> getListCurrentWeather();
}
