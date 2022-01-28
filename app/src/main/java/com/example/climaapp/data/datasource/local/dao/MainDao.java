package com.example.climaapp.data.datasource.local.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.climaapp.data.datasource.local.entity.MainEntity;

import java.util.List;

@Dao
public interface MainDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertMain(MainEntity mainEntity);

    @Query("SELECT * FROM  MainEntity")
    List<MainEntity> getAll();

    @Delete
    void delete(MainEntity mainEntity);
}
