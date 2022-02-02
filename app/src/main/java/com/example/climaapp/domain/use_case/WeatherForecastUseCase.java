package com.example.climaapp.domain.use_case;

import androidx.lifecycle.LiveData;

import com.example.climaapp.domain.entities.WeatherForecast;
import com.example.climaapp.domain.repository.WeatherForecastRepository;

import javax.inject.Inject;


public class WeatherForecastUseCase {
    final WeatherForecastRepository weatherForecastRepository;

    @Inject
    public WeatherForecastUseCase(WeatherForecastRepository weatherForecastRepository) {
        this.weatherForecastRepository = weatherForecastRepository;
    }

    public LiveData<WeatherForecast> getWeatherForecastLocal(String cityName){
        return this.weatherForecastRepository.getWeatherForecast(cityName);
    }
}
