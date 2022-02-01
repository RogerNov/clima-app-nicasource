package com.example.climaapp.data.repository;

import android.util.Log;

import androidx.lifecycle.LiveData;

import com.example.climaapp.data.datasource.local.CurrentWeatherLocalDataSource;
import com.example.climaapp.data.datasource.remote.CurrentWeatherDataSource;
import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.CurrentWeatherWithWeather;
import com.example.climaapp.domain.repository.WeatherRepository;

import java.util.List;

import javax.inject.Inject;

public class CurrentWeatherRepositoryImp implements WeatherRepository {
    private final CurrentWeatherDataSource weatherDataSource;
    private final CurrentWeatherLocalDataSource currentWeatherLocalDataSource;

    @Inject
    public CurrentWeatherRepositoryImp(
            CurrentWeatherDataSource weatherDataSource,
            CurrentWeatherLocalDataSource currentWeatherLocalDataSource
    ) {
        this.weatherDataSource = weatherDataSource;
        this.currentWeatherLocalDataSource = currentWeatherLocalDataSource;
    }

    @Override
    public LiveData<CurrentWeather> getCurrentWeather(String cityName) {
       return weatherDataSource.getCurrentWeather(cityName);
    }

    @Override
    public LiveData<CurrentWeather> getCurrentWeatherLocal(String cityName) {

        return currentWeatherLocalDataSource.getCurrentWeather(cityName);
    }

    @Override
    public LiveData<List<CurrentWeatherWithWeather>> getListCurrentWeather() {
        return currentWeatherLocalDataSource.getCurrentWeathers();
    }

    @Override
    public void insertCurrentWeather(CurrentWeather weather) {
        Log.d("Eureka","Se encontro");
        currentWeatherLocalDataSource.insertCurrentWeather(weather);
    }

}
