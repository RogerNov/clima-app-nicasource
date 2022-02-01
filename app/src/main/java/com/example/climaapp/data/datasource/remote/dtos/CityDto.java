package com.example.climaapp.data.datasource.remote.dtos;

import com.google.gson.annotations.SerializedName;

public class CityDto{

    @SerializedName("id")
    public int id;

    @SerializedName("name")
    public String name;
}