package com.example.climaapp.domain.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class City implements Serializable {
    @PrimaryKey
    public int id;

    public String name;
}
