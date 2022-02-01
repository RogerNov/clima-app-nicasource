package com.example.climaapp.data.datasource.local.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.climaapp.domain.entities.ListForecast;

import java.util.List;

@Dao
public interface ListForecastDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertListForecast(ListForecast listForecastEntity);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertListForecasts(List<ListForecast> listForecastEntity);

    @Query("SELECT * FROM  ListForecast")
    List<ListForecast> getAll();

    @Query("SELECT * FROM ListForecast ORDER BY idListForecast DESC LIMIT 1 ")
    ListForecast getLastForecast();

    @Delete
    void delete(ListForecast listForecastEntity);
}
