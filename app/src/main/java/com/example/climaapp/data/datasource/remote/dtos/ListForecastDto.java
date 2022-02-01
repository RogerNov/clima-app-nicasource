package com.example.climaapp.data.datasource.remote.dtos;

import com.example.climaapp.domain.entities.ListForecast;
import com.example.climaapp.domain.entities.Main;
import com.google.gson.annotations.SerializedName;

public class ListForecastDto extends ListForecast {

    @SerializedName("main")
    private transient MainDto main;

    @SerializedName("dt_txt")
    private transient String dtTxt;

}