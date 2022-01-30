package com.example.climaapp.data.datasource.local.entity;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.climaapp.data.datasource.remote.dtos.WeatherDto;
import com.example.climaapp.domain.entities.Weather;

@Entity
public class WeatherEntity {

    @PrimaryKey
    public Integer id;

    public String main;

    public String description;

    public String icon;

}
