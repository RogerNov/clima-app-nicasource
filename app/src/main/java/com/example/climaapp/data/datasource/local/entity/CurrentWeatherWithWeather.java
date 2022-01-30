package com.example.climaapp.data.datasource.local.entity;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.example.climaapp.domain.entities.CurrentWeather;

import java.util.List;

public class CurrentWeatherWithWeather {
    @Embedded public CurrentWeatherEntity currentWeatherEntity;
    @Relation(
            parentColumn = "currentWeatherId",
            entityColumn = "weatherId",
            associateBy = @Junction(CurrentWeatherWeatherCrossRef.class)
    )
    public List<WeatherEntity> weathers;
}
