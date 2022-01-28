package com.example.climaapp.data.datasource.remote.dtos;


import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.Weather;
import com.example.climaapp.domain.entities.Wind;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CurrentWeatherDto extends  CurrentWeather{

    @SerializedName("cod")
    @Expose
    private Integer cod;

    @SerializedName("weather")
    @Expose
    private List<WeatherDto> weather;

    @SerializedName("base")
    @Expose
    private String base;

    @SerializedName("main")
    @Expose
    private MainDto main;

    @SerializedName("wind")
    @Expose
    private WindDto wind;

    @SerializedName("name")
    @Expose
    private String name;


    public CurrentWeatherDto(Integer cod, List<Weather> weather, String base, MainDto main, Wind wind, String name) {
        super(cod, weather, base, main, wind, name);
    }
}
