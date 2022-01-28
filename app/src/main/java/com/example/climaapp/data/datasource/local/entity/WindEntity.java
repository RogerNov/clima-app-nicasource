package com.example.climaapp.data.datasource.local.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.climaapp.domain.entities.Wind;

@Entity
public class WindEntity extends Wind {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private Double speed;
    private Integer deg;

    public WindEntity(Double speed, Integer deg) {
        super(speed, deg);
    }
}
