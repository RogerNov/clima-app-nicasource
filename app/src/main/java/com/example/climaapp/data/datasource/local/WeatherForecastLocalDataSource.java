package com.example.climaapp.data.datasource.local;


import com.example.climaapp.domain.entities.WeatherForecast;
import com.example.climaapp.domain.entities.WeatherForecastListForecast;

public interface WeatherForecastLocalDataSource {
    void insertWeatherForecast(WeatherForecast weatherForecast);
    WeatherForecastListForecast getWeatherForecast(String names);
}
