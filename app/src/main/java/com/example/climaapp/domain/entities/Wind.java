package com.example.climaapp.domain.entities;


import androidx.room.Ignore;

public class Wind {
    private Double speed;
    private Integer deg;

    @Ignore
    public Wind(){}

    public Wind(Double speed, Integer deg) {
        this.speed = speed;
        this.deg = deg;
    }

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
