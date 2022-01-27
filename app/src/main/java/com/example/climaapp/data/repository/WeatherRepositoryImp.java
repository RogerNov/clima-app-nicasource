package com.example.climaapp.data.repository;

import com.example.climaapp.data.datasource.remote.WeatherApi;
import com.example.climaapp.data.datasource.remote.dtos.CurrentWeatherDto;
import com.example.climaapp.data.datasource.remote.dtos.WeatherForecastDto;
import com.example.climaapp.domain.repository.WeatherRepository;

import java.util.List;

public class WeatherRepositoryImp implements WeatherRepository {
    private final WeatherApi weatherApi;

    public WeatherRepositoryImp(WeatherApi weatherApi) {
        this.weatherApi = weatherApi;
    }

    @Override
    public CurrentWeatherDto getCurrentWeather(String cityName) {
        return  null;
    }

    @Override
    public List<CurrentWeatherDto> getListCurrentWheater() {
        return null;
    }

    @Override
    public WeatherForecastDto getWeatherForecast(String cityName) {
        return null;
    }
}
