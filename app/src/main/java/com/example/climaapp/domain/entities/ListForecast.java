package com.example.climaapp.domain.entities;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class ListForecast implements Serializable  {
    @PrimaryKey(autoGenerate = true)
    public Integer idListForecast;
    @Embedded(prefix = "main_")
    public Main main;
    public String dtTxt;
}
