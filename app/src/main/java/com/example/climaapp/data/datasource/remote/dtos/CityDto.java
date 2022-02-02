package com.example.climaapp.data.datasource.remote.dtos;

import com.google.gson.annotations.SerializedName;

public class CityDto{

    @SerializedName("id")
    public transient int id;

    @SerializedName("name")
    public transient String name;
}