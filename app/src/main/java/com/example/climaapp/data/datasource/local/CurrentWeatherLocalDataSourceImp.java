package com.example.climaapp.data.datasource.local;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.climaapp.domain.entities.CurrentWeatherWeatherCrossRef;

import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.CurrentWeatherWithWeather;
import com.example.climaapp.domain.entities.Weather;

import java.util.List;

import javax.inject.Inject;

public class CurrentWeatherLocalDataSourceImp implements  CurrentWeatherLocalDataSource{
    private final WeatherDatabase weatherDatabase;
    private MutableLiveData<List<CurrentWeather>> currentWeatherMutableList;
    private MutableLiveData<CurrentWeather> currentWeatherMutableLiveData;

    @Inject
    public CurrentWeatherLocalDataSourceImp(WeatherDatabase weatherDatabase) {
        this.weatherDatabase = weatherDatabase;
    }


    @Override
    public void insertCurrentWeather(CurrentWeather currentWeather) {

        CurrentWeatherWeatherCrossRef crossRef = new CurrentWeatherWeatherCrossRef();
        currentWeather.idCurrentWeather =currentWeather.id;
        crossRef.idCurrentWeather = currentWeather.idCurrentWeather;

        weatherDatabase.currentWeatherDao().insertCurrentWeather(currentWeather);

        for(Weather weather: currentWeather.weather){
            weather.idWeather = weather.id;
            crossRef.idWeather = weather.idWeather;
            weatherDatabase.weatherDao().insertWeather(weather);
            weatherDatabase.currentWeatherWithWeatherDao().insert(crossRef);
        }
    }

    @Override
    public LiveData<List<CurrentWeatherWithWeather>> getCurrentWeathers() {
        return weatherDatabase.currentWeatherWithWeatherDao().getCurrent();
    }

    @Override
    public CurrentWeather getCurrentWeather(String cityName) {
        return weatherDatabase.currentWeatherDao().findByName(cityName);
    }

    @Override
    public void deleteCurrentWeather(CurrentWeather currentWeather) {
        weatherDatabase.currentWeatherDao().delete(currentWeather);
    }
}
