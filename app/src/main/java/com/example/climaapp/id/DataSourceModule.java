package com.example.climaapp.id;

import com.example.climaapp.core.RetrofitHelper;
import com.example.climaapp.data.datasource.remote.CurrentWeatherDataSource;
import com.example.climaapp.data.datasource.remote.CurrentWeatherDataSourceImp;
import com.example.climaapp.data.datasource.remote.WeatherApi;
import com.example.climaapp.data.datasource.remote.WeatherForeCastDataSourceImp;
import com.example.climaapp.data.datasource.remote.WeatherForecastDataSource;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class DataSourceModule {

    @Singleton
    @Provides
    public static CurrentWeatherDataSource providerCurrentWeatherDataSource(WeatherApi api){
        return new CurrentWeatherDataSourceImp(api);
    }

    @Singleton
    @Provides
    public static WeatherForecastDataSource providerWeatherForecastDataSource(WeatherApi api){
        return new WeatherForeCastDataSourceImp(api);
    }
}
