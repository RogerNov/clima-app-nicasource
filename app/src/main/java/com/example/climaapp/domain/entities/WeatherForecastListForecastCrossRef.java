package com.example.climaapp.domain.entities;

import androidx.room.Entity;

@Entity(primaryKeys = {"idWeatherForecast", "idListForecast"})
public class WeatherForecastListForecastCrossRef {
    public Integer idWeatherForecast;
    public Integer idListForecast;
}
