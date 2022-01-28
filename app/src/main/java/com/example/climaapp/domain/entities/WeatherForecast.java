package com.example.climaapp.domain.entities;

import java.util.List;

public class WeatherForecast{
    private  String code;
    private List<ListForecast> list;

    public WeatherForecast(String code, List<ListForecast> list) {
        this.code = code;
        this.list = list;
    }
}
