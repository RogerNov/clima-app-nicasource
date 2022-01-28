package com.example.climaapp.domain.entities;

import com.example.climaapp.data.datasource.remote.dtos.MainDto;

import java.util.List;

public class CurrentWeather {

    private Integer cod;
    private List<Weather> weather;
    private String base;
    private Main main;
    private Wind wind;
    private String name;

    public CurrentWeather(Integer cod, List<Weather> weather, String base, MainDto main, Wind wind, String name) {
        this.cod = cod;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.wind = wind;
        this.name = name;
    }
}
