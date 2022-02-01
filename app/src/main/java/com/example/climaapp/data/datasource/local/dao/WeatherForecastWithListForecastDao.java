package com.example.climaapp.data.datasource.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;

import com.example.climaapp.domain.entities.WeatherForecastListForecast;
import com.example.climaapp.domain.entities.WeatherForecastListForecastCrossRef;

import java.util.List;

@Dao
public interface WeatherForecastWithListForecastDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(WeatherForecastListForecastCrossRef crossRef);

    @Transaction
    @Query("SELECT * FROM CurrentWeather")
    LiveData<List<WeatherForecastListForecast>> getCurrent();

}
