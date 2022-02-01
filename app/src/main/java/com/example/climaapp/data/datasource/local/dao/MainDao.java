package com.example.climaapp.data.datasource.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.climaapp.domain.entities.Main;

import java.util.List;

@Dao
public interface MainDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertMain(Main mainEntity);

    @Query("SELECT * FROM  Main")
    List<Main> getAll();

    @Delete
    void delete(Main mainEntity);
}
