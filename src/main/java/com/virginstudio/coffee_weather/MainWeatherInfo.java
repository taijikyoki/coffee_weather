package com.virginstudio.coffee_weather;

public class MainWeatherInfo {
    float temp;
    float feels_like;
    float temp_min;
    float temp_max;
    float pressure;
    float humidity;
    
    public MainWeatherInfo(float temp, float feels_like, float temp_min, float temp_max, float pressure, float humidity) {
        this.temp = temp;
        this.feels_like = feels_like;
        this.temp_min = temp_min;
        this.temp_max = temp_max;
        this.pressure = pressure;
        this.humidity = humidity;
    }
}
