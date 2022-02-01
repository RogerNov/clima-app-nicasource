package com.example.climaapp.domain.entities;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import java.util.List;

public class CurrentWeatherWithWeather {
    @Embedded public CurrentWeather currentWeatherEntity;
    @Relation(
            parentColumn = "idCurrentWeather",
            entityColumn = "idWeather",
            associateBy = @Junction(CurrentWeatherWeatherCrossRef.class)
    )
    public List<Weather> weathers;


}
