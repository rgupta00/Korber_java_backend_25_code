package com.wservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Value("${server.port}")
    private int  portNumber;

    public String getWeatherInfo(int temp){
        String weatherInfo="";
        if(temp>=40)
            weatherInfo="too hot to go outside";
        else if (temp >= 30)
            weatherInfo="ok to go outside but take care";
        else if (temp >= 18)
            weatherInfo="why not go outside and enjoy";
        else
            weatherInfo="too cold to go outside";

        return weatherInfo+ ": "+portNumber;
    }
}
