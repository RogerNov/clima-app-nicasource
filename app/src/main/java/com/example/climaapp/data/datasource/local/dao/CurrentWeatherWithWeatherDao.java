package com.example.climaapp.data.datasource.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;

import com.example.climaapp.domain.entities.CurrentWeatherWeatherCrossRef;
import com.example.climaapp.domain.entities.CurrentWeatherWithWeather;

import java.util.List;

@Dao
public interface CurrentWeatherWithWeatherDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
     void insert(CurrentWeatherWeatherCrossRef crossRef);

    @Transaction
    @Query("SELECT * FROM CurrentWeather")
    LiveData<List<CurrentWeatherWithWeather>> getCurrent();
}