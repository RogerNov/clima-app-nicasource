package com.example.climaapp.data.datasource.remote.dtos;

import com.example.climaapp.domain.entities.CurrentWeather;
import com.example.climaapp.domain.entities.Main;
import com.example.climaapp.domain.entities.Weather;
import com.example.climaapp.domain.entities.Wind;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CurrentWeatherDto extends  CurrentWeather {

    @SerializedName("id")
    @Expose
    private transient Integer idCurrentWeather;

    @SerializedName("weather")
    private transient List<WeatherDto> weather;

    @SerializedName("cod")
    private transient Integer cod;

    @SerializedName("id")
    private transient Integer id;

    @SerializedName("base")
    private transient String base;

    @SerializedName("main")
    private transient MainDto main;

    @SerializedName("wind")
    private transient WindDto wind;

    @SerializedName("name")
    private transient String name;
}
