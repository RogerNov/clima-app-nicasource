package com.example.climaapp.data.datasource.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.climaapp.domain.entities.ListForecast;
import com.example.climaapp.domain.entities.WeatherForecast;

import java.util.List;

@Dao
public interface WeatherForecastDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertWeatherForecast(WeatherForecast weatherForecastEntity);

    @Query("SELECT * FROM  WeatherForecast")
    LiveData<List<WeatherForecast>> getAll();


    @Query("SELECT * FROM  WeatherForecast wf INNER JOIN City c ON wf.id = c.id WHERE c.name = :cityName")
    WeatherForecast getByName(String cityName);

    @Query("SELECT * FROM WeatherForecast ORDER BY idWeatherForecast DESC LIMIT 1 ")
    WeatherForecast getLastForecast();

    @Delete
    void delete(WeatherForecast weatherForecastEntity);
}
