package com.virginstudio.coffee_weather;

import java.util.List;

public class WeatherIdentificator {
    int id;
    String main;
    String description;
    String icon;

    public WeatherIdentificator (int id, String main, String description, String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }
}
