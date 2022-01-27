package com.example.climaapp.data.datasource.remote.dtos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListForecastDto {

    @SerializedName("main")
    @Expose
    private MainDto main;

    @SerializedName("dt_txt")
    @Expose
    private String dtTxt;

    public MainDto getMain() {
        return main;
    }

    public void setMain(MainDto main) {
        this.main = main;
    }

    public String getDtTxt() {
        return dtTxt;
    }

    public void setDtTxt(String dtTxt) {
        this.dtTxt = dtTxt;
    }

}