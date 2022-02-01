package com.example.climaapp.data.datasource.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.climaapp.domain.entities.WeatherForecast;

import java.util.List;

@Dao
public interface WeatherForecastDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertWeatherForecast(WeatherForecast weatherForecastEntity);

    @Query("SELECT * FROM  WeatherForecast")
    LiveData<List<WeatherForecast>> getAll();

    /*@Query("SELECT * FROM WeatherForecast WHERE name LIKE :cod")
    WeatherForecast findByName(String name);*/

    @Delete
    void delete(WeatherForecast weatherForecastEntity);
}
