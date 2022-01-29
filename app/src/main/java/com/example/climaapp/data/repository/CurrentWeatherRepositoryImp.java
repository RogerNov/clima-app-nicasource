package com.example.climaapp.data.repository;

import com.example.climaapp.data.datasource.local.dao.CurrentWeatherDao;
import com.example.climaapp.data.datasource.local.entity.CurrentWeatherEntity;
import com.example.climaapp.data.datasource.remote.CurrentWeatherDataSource;
import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.repository.WeatherRepository;

import java.util.Collections;
import java.util.List;

public class CurrentWeatherRepositoryImp implements WeatherRepository {
    private final CurrentWeatherDataSource weatherDataSource;
    private final CurrentWeatherDao currentWeatherDao;

    public CurrentWeatherRepositoryImp(CurrentWeatherDataSource weatherDataSource, CurrentWeatherDao currentWeatherDao) {
        this.weatherDataSource = weatherDataSource;
        this.currentWeatherDao = currentWeatherDao;
    }

    @Override
    public CurrentWeather getCurrentWeather(String cityName) {
       return this.weatherDataSource.getCurrentWeather(cityName);
    }

    @Override
    public List<CurrentWeather> getListCurrentWeather() {
         List<CurrentWeatherEntity> current = currentWeatherDao.getAll();
         return Collections.emptyList();
    }

}
