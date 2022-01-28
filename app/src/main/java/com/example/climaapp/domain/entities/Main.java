package com.example.climaapp.domain.entities;

public class Main {

    private Double temp;
    private Double feelsLike;
    private Double tempMin;
    private Double tempMax;
    private Integer pressure;
    private Integer humidity;

    public Main(Double temp, Double feelsLike, Double tempMin, Double tempMax, Integer pressure, Integer humidity) {
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.pressure = pressure;
        this.humidity = humidity;
    }
}
