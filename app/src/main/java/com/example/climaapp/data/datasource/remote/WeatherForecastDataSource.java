package com.example.climaapp.data.datasource.remote;

import com.example.climaapp.domain.entities.WeatherForecast;

public interface WeatherForecastDataSource {
    WeatherForecast getWeatherForeCast(String cityName);
}
