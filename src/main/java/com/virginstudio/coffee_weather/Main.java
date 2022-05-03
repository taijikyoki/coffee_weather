package com.virginstudio.coffee_weather;

import com.google.gson.Gson;
import java.io.IOException;
import org.jsoup.Jsoup;

public class Main {

    public static void main(String[] args) throws IOException {
        
        String KEY = "15c40c891b92b92d30dc3e11911b7cbb";
        String URI = "https://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=" + KEY;
        
        String weather_text_json = Jsoup.connect(URI)
                                    .ignoreContentType(true)
                                    .get()
                                    .text();
        
        //String weather_json_doc_text = weather_json_doc.text();
        
        Gson gson = new Gson();
        WeatherInfo wi = gson.fromJson(weather_text_json, WeatherInfo.class);
        
        System.out.println(wi.main.temp);
        System.out.println("after the json text");
    }
}
