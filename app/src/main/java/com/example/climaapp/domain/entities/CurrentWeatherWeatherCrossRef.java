package com.example.climaapp.domain.entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;


@Entity(primaryKeys = {"idCurrentWeather", "idWeather"})
public class CurrentWeatherWeatherCrossRef {
    @NonNull public Integer idCurrentWeather;
    @NonNull public Integer idWeather;
}
