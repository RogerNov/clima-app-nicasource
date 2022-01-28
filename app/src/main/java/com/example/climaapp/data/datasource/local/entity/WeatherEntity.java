package com.example.climaapp.data.datasource.local.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.climaapp.domain.entities.Weather;

@Entity
public class WeatherEntity extends Weather {

    @PrimaryKey
    private Integer id;

    private String main;

    private String description;

    private String icon;

    public WeatherEntity(Integer id, String main, String description, String icon) {
        super(id, main, description, icon);
    }
}
