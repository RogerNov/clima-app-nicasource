package com.example.climaapp.data.datasource.remote;

import com.example.climaapp.domain.entities.WeatherForecast;

import javax.inject.Inject;

public class WeatherForeCastDataSourceImp implements  WeatherForecastDataSource{
    final WeatherApi weatherApi;

    @Inject
    public WeatherForeCastDataSourceImp(WeatherApi weatherApi) {
        this.weatherApi = weatherApi;
    }


    @Override
    public WeatherForecast getWeatherForeCast(String cityName) {
        WeatherForecast weatherForecast = weatherApi.getWeatherForecast(cityName).body();
        return weatherForecast;
        /*Call<WeatherForecastDto> call = retrofit.create(WeatherApi.class).getWeatherForecast(cityName);
        try {
            Response<WeatherForecastDto> response = call.execute();
            return response.body();
        } catch (IOException e) {
        }*/
    }
}
