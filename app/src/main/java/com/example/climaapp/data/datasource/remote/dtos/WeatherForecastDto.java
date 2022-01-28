package com.example.climaapp.data.datasource.remote.dtos;

import com.example.climaapp.domain.entities.ListForecast;
import com.example.climaapp.domain.entities.WeatherForecast;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class WeatherForecastDto extends WeatherForecast {

    @SerializedName("cod")
    @Expose
    private String cod;

    @SerializedName("list")
    @Expose
    private List<ListForecastDto> list = null;


    public WeatherForecastDto(String cod, List<ListForecast> list) {
        super(cod, list);
    }
}
