package com.example.climaapp.data.datasource.local.entity;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.climaapp.data.datasource.remote.dtos.ListForecastDto;
import com.example.climaapp.data.datasource.remote.dtos.MainDto;
import com.example.climaapp.domain.entities.ListForecast;
import com.example.climaapp.domain.entities.Main;

@Entity
public class ListForecastEntity {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id_list_forecast")
    public Integer id;

    @Embedded
    public Main main;

    public String dtTxt;

}
