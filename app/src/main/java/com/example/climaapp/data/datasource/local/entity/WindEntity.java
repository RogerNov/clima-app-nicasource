package com.example.climaapp.data.datasource.local.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.climaapp.data.datasource.remote.dtos.WindDto;
import com.example.climaapp.domain.entities.Wind;

@Entity
public class WindEntity {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_wind")
    public int id;

    public Double speed;
    public Integer deg;
}
