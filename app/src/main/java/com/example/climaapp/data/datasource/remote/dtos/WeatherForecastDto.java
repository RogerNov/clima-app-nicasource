package com.example.climaapp.data.datasource.remote.dtos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherForecastDto {
    @SerializedName("list")
    @Expose
    private List<ListForecastDto> list = null;


    public List<ListForecastDto> getList() {
        return list;
    }

    public void setList(List<ListForecastDto> list) {
        this.list = list;
    }
}
