package com.example.climaapp.data.datasource.local.entity;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.climaapp.domain.entities.ListForecast;
import com.example.climaapp.domain.entities.Main;

@Entity
public class ListForecastEntity extends ListForecast {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id_list_forecast")
    public Integer id;

    @Embedded
    public Main main;

    public String dtTxt;

    public ListForecastEntity(Main main, String dtTxt) {
        super(main, dtTxt);
    }
}
