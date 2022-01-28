package com.example.climaapp.data.datasource.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.climaapp.data.datasource.local.entity.WindEntity;

import java.util.List;

@Dao
public interface WindDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertWeather(WindEntity windEntity);

    @Query("SELECT * FROM  WindEntity")
    List<WindEntity> getAll();

    @Delete
    void delete(WindEntity windEntity);
}
