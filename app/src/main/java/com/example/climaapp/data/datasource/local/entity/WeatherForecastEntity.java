package com.example.climaapp.data.datasource.local.entity;

import androidx.annotation.NonNull;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.climaapp.domain.entities.ListForecast;
import com.example.climaapp.domain.entities.WeatherForecast;

import java.util.List;

@Entity
public class WeatherForecastEntity  extends WeatherForecast {

    @PrimaryKey
    @NonNull
    public String cod = "";

    @Embedded
    public List<ListForecast> list = null;

    public WeatherForecastEntity(String code, List<ListForecast> list) {
        super(code, list);
    }
}
