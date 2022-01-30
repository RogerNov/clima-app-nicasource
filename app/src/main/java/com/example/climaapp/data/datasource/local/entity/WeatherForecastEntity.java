package com.example.climaapp.data.datasource.local.entity;

import androidx.annotation.NonNull;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.climaapp.data.datasource.remote.dtos.WeatherForecastDto;
import com.example.climaapp.domain.entities.ListForecast;
import com.example.climaapp.domain.entities.WeatherForecast;

import java.util.List;

@Entity
public class WeatherForecastEntity {

    @PrimaryKey
    @NonNull
    public String cod = "";

}
