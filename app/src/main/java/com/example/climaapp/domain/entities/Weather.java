package com.example.climaapp.domain.entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Weather implements Serializable {

    @PrimaryKey
    public Integer idWeather;
    public String main;
    public String description;
    public String icon;
    @Ignore
    public Integer id;

}
