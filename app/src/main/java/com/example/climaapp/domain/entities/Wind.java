package com.example.climaapp.domain.entities;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Wind{
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_wind")
    public int id;

    public Double speed;
    public Integer deg;

}
