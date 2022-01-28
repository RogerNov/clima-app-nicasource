package com.example.climaapp.data.datasource.local.entity;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.climaapp.domain.entities.ListForecast;
import com.example.climaapp.domain.entities.WeatherForecast;

import java.util.List;

@Entity
public class WeatherForecastEntity  extends WeatherForecast {

    @PrimaryKey
    private String cod;

    @Embedded
    private List<ListForecastEntity> list;

    public WeatherForecastEntity(String code, List<ListForecast> list) {
        super(code, list);
    }
}
