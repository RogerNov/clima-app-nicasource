package com.example.climaapp.data.datasource.remote;

import com.example.climaapp.data.datasource.remote.dtos.CurrentWeatherDto;
import com.example.climaapp.data.datasource.remote.dtos.WeatherForecastDto;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {

    @GET("weather?")
    Call<CurrentWeatherDto> getCurrentWeather(@Query("q") String cityName, @Query("appid") String appId);

    @GET("forecast?")
    Call<WeatherForecastDto> getWeatherForecast(@Query("q") String cityName, @Query("appid") String appId);

}
