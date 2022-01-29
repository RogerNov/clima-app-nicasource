package com.example.climaapp.domain.entities;

import androidx.room.Ignore;

public class ListForecast {
    private Main main;
    private String dtTxt;

    @Ignore
    public ListForecast(){}

    public ListForecast(Main main, String dtTxt) {
        this.main = main;
        this.dtTxt = dtTxt;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public String getDtTxt() {
        return dtTxt;
    }

    public void setDtTxt(String dtTxt) {
        this.dtTxt = dtTxt;
    }
}
