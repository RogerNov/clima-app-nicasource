package com.example.climaapp.data.datasource.remote;

import com.example.climaapp.data.datasource.remote.dtos.WeatherForecastDto;
import retrofit2.Call;

public interface WeatherForecastDataSource {
    Call<WeatherForecastDto> getWeatherForeCast(String cityName);
}
