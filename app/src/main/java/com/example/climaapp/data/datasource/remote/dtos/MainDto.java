package com.example.climaapp.data.datasource.remote.dtos;
import com.example.climaapp.domain.entities.Main;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MainDto extends Main {
    @SerializedName("temp")
    @Expose
    private Double temp;
    @SerializedName("feels_like")
    @Expose
    private Double feelsLike;
    @SerializedName("temp_min")
    @Expose
    private Double tempMin;
    @SerializedName("temp_max")
    @Expose
    private Double tempMax;
    @SerializedName("pressure")
    @Expose
    private Integer pressure;
    @SerializedName("humidity")
    @Expose
    private Integer humidity;

    public MainDto(Double temp, Double feelsLike, Double tempMin, Double tempMax, Integer pressure, Integer humidity){
        super(temp, feelsLike, tempMin, tempMax, pressure, humidity);
    }
}
