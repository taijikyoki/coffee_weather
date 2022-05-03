package com.virginstudio.coffee_weather;

class SystematicInfo {
    
    int type;
    int id;
    float message;
    String country;
    int sunrise;
    int sunset;
    
    public SystematicInfo (int type, int id, float message, String country, int sunrise, int sunset) {
        this.type = type;
        this.id = id;
        this.message = message;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }
}
