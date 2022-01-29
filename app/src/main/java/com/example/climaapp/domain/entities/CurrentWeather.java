package com.example.climaapp.domain.entities;

import androidx.room.Ignore;
import java.util.List;

public class CurrentWeather {

    private Integer cod;
    private List<Weather> weather;
    private String base;
    private Main main;
    private Wind wind;
    private String name;

    @Ignore
    public CurrentWeather(){}

    public CurrentWeather(Integer cod, List<Weather> weather, String base, Main main, Wind wind, String name) {
        this.cod = cod;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.wind = wind;
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
