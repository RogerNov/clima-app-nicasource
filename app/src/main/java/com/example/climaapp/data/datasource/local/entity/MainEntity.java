package com.example.climaapp.data.datasource.local.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.climaapp.domain.entities.Main;

@Entity
public class MainEntity extends Main {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_main")
    public int id;

    public Double temp;

    public Double feelsLike;

    public Double tempMin;

    public Double tempMax;

    public Integer pressure;

    public Integer humidity;

    public MainEntity(Double temp, Double feelsLike, Double tempMin, Double tempMax, Integer pressure, Integer humidity) {
        super(temp, feelsLike, tempMin, tempMax, pressure, humidity);
    }
}
