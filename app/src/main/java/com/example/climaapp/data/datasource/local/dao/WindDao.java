package com.example.climaapp.data.datasource.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.climaapp.domain.entities.Wind;

import java.util.List;


@Dao
public interface WindDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertWind(Wind windEntity);

    @Query("SELECT * FROM  Wind")
    List<Wind> getAll();

    @Delete
    void delete(Wind wind);
}
