package com.example.climaapp.data.datasource.remote;

import com.example.climaapp.data.datasource.remote.dtos.CurrentWeatherDto;
import com.example.climaapp.domain.entities.CurrentWeather;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

public class CurrentWeatherDataSourceImp implements CurrentWeatherDataSource {
    private final Retrofit retrofit;

    public CurrentWeatherDataSourceImp(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    @Override
    public CurrentWeather getCurrentWeather(String cityName) {
        Call<CurrentWeatherDto> call = retrofit.create(WeatherApi.class).getCurrentWeather(cityName);
        try {
            Response<CurrentWeatherDto> response = call.execute();
            return response.body();
        } catch (IOException e) {
        }
        return  null;
    }
}
