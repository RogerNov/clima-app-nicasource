package com.example.climaapp.domain.entities;

import com.example.climaapp.data.datasource.remote.dtos.MainDto;

public class ListForecast {
    private Main main;
    private String dtTxt;

    public ListForecast(Main main, String dtTxt) {
        this.main = main;
        this.dtTxt = dtTxt;
    }
}
