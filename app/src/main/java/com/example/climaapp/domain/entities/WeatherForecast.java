package com.example.climaapp.domain.entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity
public class WeatherForecast{
    @PrimaryKey(autoGenerate = true)
    public Integer idWeatherForecast;

    @Ignore
    public List<ListForecast> list;

    public City city;
}
