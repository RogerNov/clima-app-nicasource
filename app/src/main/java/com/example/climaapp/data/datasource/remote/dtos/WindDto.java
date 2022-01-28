package com.example.climaapp.data.datasource.remote.dtos;


import com.example.climaapp.domain.entities.Wind;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WindDto extends Wind {

    @SerializedName("speed")
    @Expose
    private Double speed;
    @SerializedName("deg")
    @Expose
    private Integer deg;


    public WindDto(Double speed, Integer deg){
        super(speed, deg);
    }


}