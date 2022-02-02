package com.example.climaapp.domain.use_case;

import androidx.lifecycle.LiveData;

import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.CurrentWeatherWithWeather;
import com.example.climaapp.domain.repository.WeatherRepository;

import java.util.List;

import javax.inject.Inject;

public class CurrentWeatherUseCase {
    final WeatherRepository weatherRepository;

    @Inject
    public CurrentWeatherUseCase(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    public LiveData<List<CurrentWeatherWithWeather>> getListCurrentWeather(){
        return this.weatherRepository.getListCurrentWeather();
    }

    public LiveData<Boolean> insertCurrentWeather(String cityName){
        return this.weatherRepository.insertCurrentWeather(cityName);
    }



}
