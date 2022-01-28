package com.example.climaapp.data.datasource.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.climaapp.data.datasource.local.entity.ListForecastEntity;

import java.util.List;

@Dao
public interface ListForecastDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertListForecast(ListForecastEntity listForecastEntity);

    @Query("SELECT * FROM  ListForecastEntity")
    List<ListForecastEntity> getAll();

    @Delete
    void delete(ListForecastEntity listForecastEntity);
}
