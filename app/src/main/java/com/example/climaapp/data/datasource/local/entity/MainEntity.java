package com.example.climaapp.data.datasource.local.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.climaapp.domain.entities.Main;

@Entity
public class MainEntity extends Main {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private Double temp;

    private Double feelsLike;

    private Double tempMin;

    private Double tempMax;

    private Integer pressure;

    private Integer humidity;

    public MainEntity(Double temp, Double feelsLike, Double tempMin, Double tempMax, Integer pressure, Integer humidity) {
        super(temp, feelsLike, tempMin, tempMax, pressure, humidity);
    }
}
