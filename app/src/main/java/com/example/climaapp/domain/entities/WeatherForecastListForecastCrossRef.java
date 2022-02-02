package com.example.climaapp.domain.entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;

@Entity(primaryKeys = {"idWeatherForecast", "idListForecast"})
public class WeatherForecastListForecastCrossRef {
    @NonNull public Integer idWeatherForecast;
    @NonNull public Integer idListForecast;
}
