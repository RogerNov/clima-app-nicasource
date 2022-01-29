package com.example.climaapp.data.datasource.local.entity;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.Main;
import com.example.climaapp.domain.entities.Weather;
import com.example.climaapp.domain.entities.Wind;

import java.util.List;

@Entity
public class CurrentWeatherEntity extends CurrentWeather {

    @PrimaryKey
    public Integer cod;

    @Embedded
    public List<Weather> weather;

    public String base;

    @Embedded
    public Main main;

    @Embedded
    public Wind wind;

    public String name;

    public CurrentWeatherEntity(Integer cod, List<Weather> weather, String base, Main main, Wind wind, String name) {
        super(cod, weather, base, main, wind, name);
    }
}
