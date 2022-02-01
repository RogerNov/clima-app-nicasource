package com.example.climaapp.domain.entities;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;


import java.util.List;

@Entity
public class CurrentWeather{
    @PrimaryKey
    public  Integer idCurrentWeather;
    @Ignore
    public  List<Weather> weather;
    public  String base;
    @Embedded(prefix = "main_")
    public  Main main;
    @Embedded(prefix = "wind_")
    public  Wind wind;
    public  String name;

}
