package com.example.climaapp.data.datasource.local.entity;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.climaapp.data.datasource.remote.dtos.MainDto;
import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.Weather;
import com.example.climaapp.domain.entities.Wind;

import java.util.List;

@Entity
public class CurrentWeatherEntity extends CurrentWeather {

    @PrimaryKey
    private Integer cod;

    @Embedded
    private List<WeatherEntity> weather;

    private String base;

    @Embedded
    private MainEntity main;

    @Embedded
    private WindEntity wind;

    private String name;

    public CurrentWeatherEntity(Integer cod, List<Weather> weather, String base, MainDto main, Wind wind, String name) {
        super(cod, weather, base, main, wind, name);
    }
}
