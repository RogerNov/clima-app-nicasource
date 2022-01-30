package com.example.climaapp.data.datasource.local.entity;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class WeatherForecastListForecast {
    @Embedded public WeatherForecastEntity weatherForecast;
    @Relation(
            parentColumn = "weatherForecastId",
            entityColumn = "ListForecastId",
            associateBy = @Junction(WeatherForecastListForecastCrossRef.class)
    )
    public List<ListForecastEntity> listForecasts;
}
