package com.example.climaapp.id;

import com.example.climaapp.data.datasource.local.CurrentWeatherLocalDataSource;
import com.example.climaapp.data.datasource.local.dao.CurrentWeatherDao;
import com.example.climaapp.data.datasource.remote.CurrentWeatherDataSource;
import com.example.climaapp.data.datasource.remote.WeatherForecastDataSource;
import com.example.climaapp.data.datasource.remote.dtos.WeatherForecastDto;
import com.example.climaapp.data.repository.CurrentWeatherRepositoryImp;
import com.example.climaapp.data.repository.WeatherForecastRepositoryImp;
import com.example.climaapp.domain.entities.WeatherForecast;
import com.example.climaapp.domain.repository.WeatherForecastRepository;
import com.example.climaapp.domain.repository.WeatherRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class RepositoryModule {

    @Singleton
    @Provides
    public static WeatherRepository providerCurrentWeatherRepository(
            CurrentWeatherDataSource currentWeatherDataSource,
            CurrentWeatherLocalDataSource currentWeatherLocalDataSource
    ){
        return new CurrentWeatherRepositoryImp(currentWeatherDataSource,currentWeatherLocalDataSource);
    }

    @Singleton
    @Provides
    public static WeatherForecastRepository providerWeatherForecastRepository(
            WeatherForecastDataSource weatherForecastDataSource,
            WeatherForecastDto weatherForecastDto
    ){
        return new WeatherForecastRepositoryImp(weatherForecastDataSource,weatherForecastDto);
    }
}
