package com.example.climaapp.data.datasource.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.climaapp.data.datasource.local.entity.WeatherForecastEntity;

import java.util.List;

@Dao
public interface WeatherForecastDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertWeatherForecast(WeatherForecastEntity weatherForecastEntity);

    @Query("SELECT * FROM  WeatherForecastEntity")
    List<WeatherForecastEntity> getAll();

    @Query("SELECT * FROM WeatherForecastEntity WHERE cod LIKE :cod")
    WeatherForecastEntity findByName(String cod);

    @Delete
    void delete(WeatherForecastEntity weatherForecastEntity);
}
