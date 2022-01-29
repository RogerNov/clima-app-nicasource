package com.example.climaapp.data.datasource.remote;

import com.example.climaapp.data.datasource.remote.dtos.WeatherForecastDto;
import com.example.climaapp.domain.entities.WeatherForecast;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

public class WeatherForeCastDataSourceImp implements  WeatherForecastDataSource{
    final Retrofit retrofit;

    public WeatherForeCastDataSourceImp(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    @Override
    public WeatherForecast getWeatherForeCast(String cityName) {
        Call<WeatherForecastDto> call = retrofit.create(WeatherApi.class).getWeatherForecast(cityName);
        try {
            Response<WeatherForecastDto> response = call.execute();
            return response.body();
        } catch (IOException e) {
        }
        return null;
    }
}
