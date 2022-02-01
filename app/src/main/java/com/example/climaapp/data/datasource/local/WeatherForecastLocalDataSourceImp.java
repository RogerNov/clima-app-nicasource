package com.example.climaapp.data.datasource.local;

import androidx.lifecycle.LiveData;

import com.example.climaapp.data.datasource.remote.WeatherForecastDataSource;
import com.example.climaapp.domain.entities.CurrentWeatherWeatherCrossRef;
import com.example.climaapp.domain.entities.ListForecast;
import com.example.climaapp.domain.entities.WeatherForecast;

public class WeatherForecastLocalDataSourceImp implements WeatherForecastLocalDataSource {
    private final WeatherDatabase weatherDatabase;

    public WeatherForecastLocalDataSourceImp(WeatherDatabase weatherDatabase) {
        this.weatherDatabase = weatherDatabase;
    }

    @Override
    public void insertWeatherForecast(WeatherForecast weatherForecast) {
        CurrentWeatherWeatherCrossRef crossRef = new CurrentWeatherWeatherCrossRef();
        crossRef.idCurrentWeather = weatherForecast.idWeatherForecast;
        for(ListForecast forecast: weatherForecast.list){
            weatherDatabase.listForecastDao().insertListForecast(forecast);
            ListForecast listForecast = weatherDatabase.listForecastDao().getLastForecast();
            //crossRef.idWeather =
        }
        //weatherDatabase.listForecastDao().insertListForecasts(weatherForecast.list);
        weatherDatabase.weatherForecastDao().insertWeatherForecast(weatherForecast);

    }

    @Override
    public LiveData<WeatherForecast> getWeatherForecast(String cityName) {
        return null;
    }


}
