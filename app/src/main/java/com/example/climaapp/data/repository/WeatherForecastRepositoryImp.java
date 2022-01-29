package com.example.climaapp.data.repository;

import com.example.climaapp.data.datasource.remote.WeatherForecastDataSource;
import com.example.climaapp.data.datasource.remote.dtos.WeatherForecastDto;
import com.example.climaapp.domain.entities.WeatherForecast;
import com.example.climaapp.domain.repository.WeatherForecastRepository;

import javax.inject.Inject;

public class WeatherForecastRepositoryImp implements WeatherForecastRepository {
    private final WeatherForecastDataSource weatherForecastDataSource;
    private final WeatherForecastDto weatherForecastDto;

    @Inject
    public WeatherForecastRepositoryImp(WeatherForecastDataSource weatherForecastDataSource, WeatherForecastDto weatherForecastDto) {
        this.weatherForecastDataSource = weatherForecastDataSource;
        this.weatherForecastDto = weatherForecastDto;
    }

    @Override
    public WeatherForecast getWeatherForecast(String cityName) {
        return null;
    }
}
