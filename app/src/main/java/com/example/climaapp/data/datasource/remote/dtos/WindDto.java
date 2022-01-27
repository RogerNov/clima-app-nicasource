package com.example.climaapp.data.datasource.remote.dtos;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WindDto {

    @SerializedName("speed")
    @Expose
    private Double speed;
    @SerializedName("deg")
    @Expose
    private Integer deg;

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getDeg() {
        return deg;
    }

    public void setDeg(Integer deg) {
        this.deg = deg;
    }

}