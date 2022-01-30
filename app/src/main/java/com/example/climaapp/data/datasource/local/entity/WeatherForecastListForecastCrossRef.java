package com.example.climaapp.data.datasource.local.entity;

import androidx.room.Entity;

@Entity(primaryKeys = {"cod", "id_list_forecast"})
public class WeatherForecastListForecastCrossRef {
    public String weatherForecastId;
    public Integer ListForecastId;
}
