package com.example.climaapp.data.datasource.remote;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.climaapp.core.Constants;
import com.example.climaapp.data.datasource.remote.dtos.CurrentWeatherDto;
import com.example.climaapp.data.datasource.remote.dtos.WeatherForecastDto;
import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.WeatherForecast;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WeatherForeCastDataSourceImp implements  WeatherForecastDataSource{
    final WeatherApi weatherApi;

    @Inject
    public WeatherForeCastDataSourceImp(WeatherApi weatherApi) {
        this.weatherApi = weatherApi;
    }


    @Override
    public Call<WeatherForecastDto> getWeatherForeCast(String cityName) {
        return  weatherApi.getWeatherForecast(cityName, Constants.API_KEY);
        /*call.enqueue(new Callback<WeatherForecastDto>() {
            @Override
            public void onResponse(Call<WeatherForecastDto> call, Response<WeatherForecastDto> response) {
                if(response.isSuccessful()){
                    currentWeatherMutableLiveData.setValue(response.body());
                }else{
                    currentWeatherMutableLiveData.setValue(null);
                }
            }
            @Override
            public void onFailure(Call<WeatherForecastDto> call, Throwable t) {
                currentWeatherMutableLiveData.setValue(null);

            }
        });

        return currentWeatherMutableLiveData;*/
    }
}
