package com.example.climaapp.data.datasource.remote.dtos;

import com.example.climaapp.domain.entities.ListForecast;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListForecastDto extends ListForecast {

    @SerializedName("main")
    @Expose
    private MainDto main;

    @SerializedName("dt_txt")
    @Expose
    private String dtTxt;

   public ListForecastDto(MainDto main, String dtTxt){
       super(main, dtTxt);
   }

}