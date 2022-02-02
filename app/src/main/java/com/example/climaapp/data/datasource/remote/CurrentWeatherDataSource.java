package com.example.climaapp.data.datasource.remote;

import androidx.lifecycle.LiveData;

import com.example.climaapp.data.datasource.remote.dtos.CurrentWeatherDto;
import com.example.climaapp.domain.entities.CurrentWeather;

import retrofit2.Call;

public interface CurrentWeatherDataSource {
    Call<CurrentWeatherDto> getCurrentWeather(String cityName);
}


