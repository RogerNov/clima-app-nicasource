package com.example.climaapp.data.datasource.remote.dtos;


import com.example.climaapp.domain.entities.CurrentWeather;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CurrentWeatherDto {

    @SerializedName("weather")
    @Expose
    private List<WeatherDto> weather = null;

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


    /*public List<WeatherDto> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherDto> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public MainDto getMain() {
        return main;
    }

    public void setMain(MainDto main) {
        this.main = main;
    }

    public WindDto getWind() {
        return wind;
    }

    public void setWind(WindDto wind) {
        this.wind = wind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/
}
