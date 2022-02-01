package com.example.climaapp.domain.entities;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class WeatherForecastListForecast {
    @Embedded public WeatherForecast weatherForecast;
    @Relation(
            parentColumn = "idWeatherForecast",
            entityColumn = "idListForecast",
            associateBy = @Junction(WeatherForecastListForecastCrossRef.class)
    )
    public List<ListForecast> listForecasts;
}
