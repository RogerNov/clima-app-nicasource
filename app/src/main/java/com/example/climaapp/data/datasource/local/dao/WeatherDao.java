package com.example.climaapp.data.datasource.local.dao;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.climaapp.data.datasource.local.entity.WeatherEntity;

import java.util.List;

public interface WeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertWeather(WeatherEntity weatherEntity);

    @Query("SELECT * FROM  WeatherEntity")
    List<WeatherEntity> getAll();

    @Delete
    void delete(WeatherEntity weatherEntity);
}
