package com.example.climaapp.data.datasource.remote.dtos;


import com.example.climaapp.domain.entities.Weather;
import com.google.gson.annotations.SerializedName;

public class WeatherDto extends Weather {

    @SerializedName("id")
    private transient Integer id;

    @SerializedName("main")
    private transient String main;

    @SerializedName("description")
    private transient String description;

    @SerializedName("icon")
    private transient String icon;


}