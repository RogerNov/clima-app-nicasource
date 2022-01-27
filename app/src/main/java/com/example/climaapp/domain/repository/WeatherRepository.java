package com.example.climaapp.domain.repository;

import com.example.climaapp.data.datasource.remote.dtos.CurrentWeatherDto;
import com.example.climaapp.data.datasource.remote.dtos.WeatherForecastDto;
import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.WeatherForecast;

import java.util.List;

public interface WeatherRepository {
    CurrentWeatherDto getCurrentWeather(String cityName);
    List<CurrentWeatherDto> getListCurrentWheater();
    WeatherForecastDto getWeatherForecast(String cityName);
}
