package com.example.climaapp.data.datasource.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.climaapp.domain.entities.CurrentWeather;

import java.util.List;

@Dao
public interface CurrentWeatherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertCurrentWeather(CurrentWeather currentWeatherEntity);

    @Query("SELECT * FROM  CurrentWeather")
    List<CurrentWeather> getAll();

    @Query("SELECT * FROM CurrentWeather WHERE name LIKE :name")
    CurrentWeather findByName(String name);

    @Delete
    void delete(CurrentWeather currentWeather);
}
