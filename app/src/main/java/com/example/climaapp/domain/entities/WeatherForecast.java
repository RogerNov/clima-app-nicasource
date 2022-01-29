package com.example.climaapp.domain.entities;

import androidx.room.Ignore;

import java.util.List;

public class WeatherForecast{
    private  String code;
    private List<ListForecast> list;

    @Ignore
    public WeatherForecast(){}

    public WeatherForecast(String code, List<ListForecast> list) {
        this.code = code;
        this.list = list;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<ListForecast> getList() {
        return list;
    }

    public void setList(List<ListForecast> list) {
        this.list = list;
    }
}
