package com.example.climaapp.data.datasource.remote;

import com.example.climaapp.domain.entities.CurrentWeather;

import javax.inject.Inject;

import retrofit2.Response;

public class CurrentWeatherDataSourceImp implements CurrentWeatherDataSource {
    private final WeatherApi weatherApi;

    @Inject
    public CurrentWeatherDataSourceImp(WeatherApi weatherApi) {
        this.weatherApi = weatherApi;
    }

    @Override
    public CurrentWeather getCurrentWeather(String cityName) {
        CurrentWeather currentWeather = weatherApi.getCurrentWeather(cityName).body();
        return currentWeather;
        /*Call<CurrentWeatherDto> call = retrofit.create(WeatherApi.class).getCurrentWeather(cityName);
        try {
            Response<CurrentWeatherDto> response = call.execute();
            return response.body();
        } catch (IOException e) {
        }*/
    }
}
