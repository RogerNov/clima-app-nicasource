package com.example.climaapp.data.datasource.remote.dtos;

import com.example.climaapp.domain.entities.WeatherForecast;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class WeatherForecastDto extends WeatherForecast {

    @SerializedName("list")
    private transient List<ListForecastDto> list ;

    @SerializedName("city")
    private transient CityDto city;

}
