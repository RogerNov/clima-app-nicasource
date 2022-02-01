package com.example.climaapp.data.datasource.remote.dtos;

import com.example.climaapp.domain.entities.Main;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MainDto extends Main {

    @SerializedName("temp")
    private transient Double temp;

    @SerializedName("feels_like")
    private transient Double feelsLike;

    @SerializedName("temp_min")
    private transient Double tempMin;

    @SerializedName("temp_max")
    private transient Double tempMax;

    @SerializedName("pressure")
    private transient Integer pressure;

    @SerializedName("humidity")
    private transient Integer humidity;

}
