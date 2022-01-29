package com.example.climaapp.domain.repository;

import com.example.climaapp.domain.entities.WeatherForecast;

public interface WeatherForecastRepository {
    WeatherForecast getWeatherForecast(String cityName);
}
