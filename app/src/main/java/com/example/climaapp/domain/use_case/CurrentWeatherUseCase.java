package com.example.climaapp.domain.use_case;

import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.repository.WeatherRepository;

import java.util.List;

import javax.inject.Inject;

public class CurrentWeatherUseCase {
    final WeatherRepository weatherRepository;

    @Inject
    public CurrentWeatherUseCase(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    public CurrentWeather getCurrentWeatherByName(String cityName){
        return this.weatherRepository.getCurrentWeather(cityName);
    }

    public List<CurrentWeather> getListCurrentWeather(){
        return this.weatherRepository.getListCurrentWeather();
    }


}
