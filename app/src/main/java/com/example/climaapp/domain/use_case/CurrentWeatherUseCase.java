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

    public LiveData<CurrentWeather> getCurrentWeatherByName(String cityName){
        return this.weatherRepository.getCurrentWeather(cityName);
    }

    public LiveData<List<CurrentWeatherWithWeather>> getListCurrentWeather(){
        return this.weatherRepository.getListCurrentWeather();
    }

    public void insertCurrentWeather(CurrentWeather currentWeather){
        this.weatherRepository.insertCurrentWeather(currentWeather);
    }

    public LiveData<CurrentWeather> getCurrentWeatherLocal(String cityName){
        return weatherRepository.getCurrentWeatherLocal(cityName);
    }


}
