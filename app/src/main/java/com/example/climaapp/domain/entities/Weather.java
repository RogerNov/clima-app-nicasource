package com.example.climaapp.domain.entities;

public class Weather {

    private Integer id;
    private String main;
    private String description;
    private String icon;

    public Weather(Integer id, String main, String description, String icon) {
        this.id =  id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }
}
