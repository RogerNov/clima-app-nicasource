package com.example.climaapp.data.datasource.local.entity;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.climaapp.data.datasource.remote.dtos.CurrentWeatherDto;
import com.example.climaapp.data.datasource.remote.dtos.MainDto;
import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.Main;
import com.example.climaapp.domain.entities.Weather;
import com.example.climaapp.domain.entities.Wind;

import java.util.List;


@Entity
public class CurrentWeatherEntity{

    @PrimaryKey
    public Integer cod;

    public String base;

    @Embedded
    public Main main;

    @Embedded
    public Wind wind;

    public String name;
}
