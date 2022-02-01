package com.example.climaapp.domain.entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Weather{

    @PrimaryKey
    public Integer idWeather;
    public String main;
    public String description;
    public String icon;

}
