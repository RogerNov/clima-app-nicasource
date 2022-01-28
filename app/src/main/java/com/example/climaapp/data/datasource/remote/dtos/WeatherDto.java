package com.example.climaapp.data.datasource.remote.dtos;

import com.example.climaapp.domain.entities.Weather;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WeatherDto extends Weather {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("main")
    @Expose
    private String main;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("icon")
    @Expose
    private String icon;

    public WeatherDto(Integer id, String main, String description,  String icon){
        super(id, main, description, icon);

    }

}