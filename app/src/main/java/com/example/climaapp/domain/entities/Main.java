package com.example.climaapp.domain.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Main{
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_main")
    public int id;
    public Double temp;
    public Double feelsLike;
    public Double tempMin;
    public Double tempMax;
    public Integer pressure;
    public Integer humidity;
}
