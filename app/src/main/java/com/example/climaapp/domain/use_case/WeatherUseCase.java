package com.example.climaapp.domain.use_case;

import com.example.climaapp.data.datasource.remote.dtos.CurrentWeatherDto;
import com.example.climaapp.data.datasource.remote.dtos.WeatherForecastDto;
import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.WeatherForecast;
import com.example.climaapp.domain.repository.WeatherRepository;

import java.util.List;

public class WeatherUseCase {
    final WeatherRepository weatherRepository;

    public WeatherUseCase(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    public CurrentWeatherDto getCurrentWeather(String cityName){
        return this.weatherRepository.getCurrentWeather(cityName);
    }

    public List<CurrentWeatherDto> getListCurrentWeather(){
        return this.weatherRepository.getListCurrentWheater();
    }

    public WeatherForecastDto getWeatherForecast(String cityName){
        return this.weatherRepository.getWeatherForecast(cityName);
    }
}
