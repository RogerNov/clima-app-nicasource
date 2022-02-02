package com.example.climaapp.data.repository;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import com.example.climaapp.data.datasource.local.WeatherForecastLocalDataSource;
import com.example.climaapp.data.datasource.remote.WeatherForecastDataSource;
import com.example.climaapp.data.datasource.remote.dtos.WeatherForecastDto;
import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.Weather;
import com.example.climaapp.domain.entities.WeatherForecast;
import com.example.climaapp.domain.entities.WeatherForecastListForecast;
import com.example.climaapp.domain.repository.WeatherForecastRepository;

import java.util.ArrayList;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherForecastRepositoryImp implements WeatherForecastRepository {
    private final WeatherForecastDataSource weatherForecastDataSource;
    private final WeatherForecastLocalDataSource weatherForecastLocalDataSource;
    MutableLiveData<WeatherForecast> weatherForecastMutableLiveData;
    WeatherForecast weatherForecast;

    @Inject
    public WeatherForecastRepositoryImp(WeatherForecastDataSource weatherForecastDataSource, WeatherForecastLocalDataSource weatherForecastLocalDataSource) {
        this.weatherForecastDataSource = weatherForecastDataSource;
        this.weatherForecastLocalDataSource = weatherForecastLocalDataSource;
    }

    @Override
    public LiveData<WeatherForecast> getWeatherForecast(String cityName) {
        weatherForecast = new WeatherForecast();
        weatherForecastMutableLiveData = new MutableLiveData<>();

        WeatherForecastListForecast data = weatherForecastLocalDataSource.getWeatherForecast(cityName);
        if(data==null){
            weatherForecastDataSource.getWeatherForeCast(cityName).enqueue(new Callback<WeatherForecastDto>() {
              @Override
              public void onResponse(Call<WeatherForecastDto> call, Response<WeatherForecastDto> response) {
                if(response.isSuccessful()){
                    weatherForecastLocalDataSource.insertWeatherForecast(response.body());
                    weatherForecastMutableLiveData.setValue(response.body());
                }else{
                    weatherForecastMutableLiveData.setValue(null);
                }
              }

              @Override
              public void onFailure(Call<WeatherForecastDto> call, Throwable t) {
                  weatherForecastMutableLiveData.setValue(null);
              }
          });

        }else{
            weatherForecast = data.weatherForecast;
            weatherForecast.list = data.listForecasts;
            weatherForecastMutableLiveData.setValue(weatherForecast);
        }

        return weatherForecastMutableLiveData;
    }

}
