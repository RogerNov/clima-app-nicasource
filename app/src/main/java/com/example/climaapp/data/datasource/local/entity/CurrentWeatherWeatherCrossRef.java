package com.example.climaapp.data.datasource.local.entity;

import androidx.room.Entity;

import com.example.climaapp.domain.entities.CurrentWeather;

@Entity(primaryKeys = {"cod", "id"})
public class CurrentWeatherWeatherCrossRef {
    public Integer currentWeatherId;
    public Integer weatherId;
}
