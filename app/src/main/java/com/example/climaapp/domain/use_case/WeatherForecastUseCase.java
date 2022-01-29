package com.example.climaapp.domain.use_case;

import com.example.climaapp.domain.repository.WeatherForecastRepository;

import javax.inject.Inject;


public class WeatherForecastUseCase {
    final WeatherForecastRepository weatherForecastRepository;

    @Inject
    public WeatherForecastUseCase(WeatherForecastRepository weatherForecastRepository) {
        this.weatherForecastRepository = weatherForecastRepository;
    }
}
