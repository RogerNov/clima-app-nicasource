package com.example.climaapp.domain.entities;

import com.example.climaapp.data.datasource.remote.dtos.ListForecastDto;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherForecast {
    private List<ListForecastDto> list = null;
}
