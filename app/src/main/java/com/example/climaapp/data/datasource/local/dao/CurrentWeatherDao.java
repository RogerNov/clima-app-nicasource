package com.example.climaapp.data.datasource.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.climaapp.data.datasource.local.entity.CurrentWeatherEntity;

import java.util.List;

@Dao
public interface CurrentWeatherDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertCurrentWeather(CurrentWeatherEntity currentWeatherEntity);

    @Query("SELECT * FROM  CurrentWeatherEntity")
    List<CurrentWeatherEntity> getAll();

    @Query("SELECT * FROM CurrentWeatherEntity WHERE name LIKE :name")
    CurrentWeatherEntity findByName(String name);

    @Delete
    void delete(CurrentWeatherEntity currentWeather);

}
