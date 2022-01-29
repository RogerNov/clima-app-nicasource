package com.example.climaapp.id;

import com.example.climaapp.domain.repository.WeatherForecastRepository;
import com.example.climaapp.domain.repository.WeatherRepository;
import com.example.climaapp.domain.use_case.CurrentWeatherUseCase;
import com.example.climaapp.domain.use_case.WeatherForecastUseCase;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class UseCaseModule {

    @Singleton
    @Provides
    public static CurrentWeatherUseCase providerCurrentWeatherUseCase(WeatherRepository weatherRepository){
        return new CurrentWeatherUseCase(weatherRepository);
    }

    @Singleton
    @Provides
    public static WeatherForecastUseCase providerWeatherForecastUseCase(WeatherForecastRepository weatherForecastRepository){
        return new WeatherForecastUseCase(weatherForecastRepository);
    }
}
