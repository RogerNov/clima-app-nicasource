package com.example.climaapp.data.datasource.local;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.climaapp.domain.entities.CurrentWeatherWeatherCrossRef;

import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.CurrentWeatherWithWeather;
import com.example.climaapp.domain.entities.Weather;

import java.util.List;

public class CurrentWeatherLocalDataSourceImp implements  CurrentWeatherLocalDataSource{
    private final WeatherDatabase weatherDatabase;
    private MutableLiveData<List<CurrentWeather>> currentWeatherMutableList;
    private MutableLiveData<CurrentWeather> currentWeatherMutableLiveData;

    public CurrentWeatherLocalDataSourceImp(WeatherDatabase weatherDatabase) {
        this.weatherDatabase = weatherDatabase;
    }


    @Override
    public void insertCurrentWeather(CurrentWeather currentWeather) {

        CurrentWeatherWeatherCrossRef crossRef = new CurrentWeatherWeatherCrossRef();

        crossRef.idCurrentWeather = currentWeather.idCurrentWeather;

        for(Weather weather: currentWeather.weather){
            crossRef.idWeather = weather.idWeather;
            weatherDatabase.weatherDao().insertWeather(weather);
            weatherDatabase.currentWeatherWithWeatherDao().insert(crossRef);
        }
        Log.d("Totales en weather", String.valueOf(currentWeather.weather.size()));
        //weatherDatabase.weatherDao().insertWeatherList(currentWeather.weather);
        weatherDatabase.currentWeatherDao().insertCurrentWeather(currentWeather);

    }

    @Override
    public LiveData<List<CurrentWeatherWithWeather>> getCurrentWeathers() {
        return weatherDatabase.currentWeatherWithWeatherDao().getCurrent();
    }

    @Override
    public LiveData<CurrentWeather> getCurrentWeather(String cityName) {
        return weatherDatabase.currentWeatherDao().findByName(cityName);
    }
}
