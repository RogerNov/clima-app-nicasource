package com.example.climaapp.data.datasource.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.climaapp.domain.entities.Weather;

import java.util.List;

@Dao
public interface WeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertWeather(Weather weather);

    @Insert
    void insertWeatherList(List<Weather> listWeather);

    @Query("SELECT * FROM  Weather")
    List<Weather> getAll();

    @Delete
    void delete(Weather weatherEntity);
}
