package com.example.climaapp.id;

import com.example.climaapp.data.datasource.local.WeatherDatabase;
import com.example.climaapp.data.datasource.local.dao.CurrentWeatherDao;
import com.example.climaapp.data.datasource.local.dao.WeatherForecastDao;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class DatabaseModule {

//    @Singleton
//    @Provides
//    public static CurrentWeatherDao providerCurrentWeatherDao(WeatherDatabase database){
//        return database.currentWeatherDao();
//    }
//
//    @Singleton
//    @Provides
//    public static WeatherForecastDao providerWeatherForecastDao(WeatherDatabase database){
//        return database.weatherForecastDao();
//    }
}
