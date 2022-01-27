package com.example.climaapp.domain.entities;

import com.example.climaapp.data.datasource.remote.dtos.MainDto;
import com.example.climaapp.data.datasource.remote.dtos.WeatherDto;
import com.example.climaapp.data.datasource.remote.dtos.WindDto;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CurrentWeather {

    private List<WeatherDto> weather = null;
    private String base;
    private MainDto main;
    private WindDto wind;
    private String name;
}
