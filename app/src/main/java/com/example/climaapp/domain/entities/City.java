package com.example.climaapp.domain.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class City {
    @PrimaryKey
    public int id;

    public String name;
}
