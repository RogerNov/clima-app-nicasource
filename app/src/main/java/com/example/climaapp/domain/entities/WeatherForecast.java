package com.example.climaapp.domain.entities;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.List;

@Entity
public class WeatherForecast implements Serializable {
    @PrimaryKey(autoGenerate = true)
    public Integer idWeatherForecast;

    @Ignore
    public List<ListForecast> list;

    @Embedded
    public City city;
}
