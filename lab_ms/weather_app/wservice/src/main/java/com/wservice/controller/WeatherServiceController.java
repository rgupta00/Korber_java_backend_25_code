package com.wservice.controller;

import com.wservice.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherServiceController {

    private WeatherService weatherService;

    @Autowired
    public WeatherServiceController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    //http://localhost:8082/wservice/weatherservice/20
    @GetMapping(path = "/weatherservice/{temp}")
    public String getWeatherInfo(@PathVariable int temp) {
        return weatherService.getWeatherInfo(temp);
    }
}
