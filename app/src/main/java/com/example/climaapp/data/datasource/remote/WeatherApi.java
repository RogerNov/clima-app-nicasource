package com.example.climaapp.data.datasource.remote;

import com.example.climaapp.data.datasource.remote.dtos.CurrentWeatherDto;
import com.example.climaapp.data.datasource.remote.dtos.WeatherForecastDto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WeatherApi {

    @GET("weather?q={cityName}&appid=5daa64b3b1524be2f8902896607c6084")
    Call<CurrentWeatherDto> getCurrentWeather(@Path("cityName") String cityName);

    @GET("2.5/forecast?q={cityName}&appid=5daa64b3b1524be2f8902896607c6084")
    Call<WeatherForecastDto> getWeatherForecast(@Path("cityName") String cityName);

}
