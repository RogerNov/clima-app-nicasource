package com.example.climaapp.data.datasource.remote;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.navigation.ui.NavigationUI;

import com.example.climaapp.core.Constants;
import com.example.climaapp.data.datasource.remote.dtos.CurrentWeatherDto;
import com.example.climaapp.domain.entities.CurrentWeather;

import java.io.IOException;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CurrentWeatherDataSourceImp implements CurrentWeatherDataSource {
    private final WeatherApi weatherApi;
    private MutableLiveData<CurrentWeather> currentWeatherMutableLiveData;


    @Inject
    public CurrentWeatherDataSourceImp(WeatherApi weatherApi) {
        this.weatherApi = weatherApi;
    }

    @Override
    public LiveData<CurrentWeather> getCurrentWeather(String cityName) {

            currentWeatherMutableLiveData = new MutableLiveData<>();
            Call<CurrentWeatherDto> call = weatherApi.getCurrentWeather(cityName, Constants.API_KEY);
            call.enqueue(new Callback<CurrentWeatherDto>() {
                @Override
                public void onResponse(Call<CurrentWeatherDto> call, Response<CurrentWeatherDto> response) {
                   if(response.isSuccessful()){
                       currentWeatherMutableLiveData.setValue(response.body());
                   }else{
                       currentWeatherMutableLiveData.setValue(null);

                   }
                }

                @Override
                public void onFailure(Call<CurrentWeatherDto> call, Throwable t) {
                    currentWeatherMutableLiveData.setValue(null);

                }
            });

        return currentWeatherMutableLiveData;

    }
}
