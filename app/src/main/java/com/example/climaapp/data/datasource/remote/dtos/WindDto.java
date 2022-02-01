package com.example.climaapp.data.datasource.remote.dtos;


import com.example.climaapp.domain.entities.Wind;
import com.google.gson.annotations.SerializedName;

public class WindDto extends Wind {

    @SerializedName("speed")
    private transient Double speed;
    @SerializedName("deg")
    private transient Integer deg;

}