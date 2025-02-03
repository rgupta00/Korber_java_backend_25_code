package com.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    private Logger logger= LoggerFactory.getLogger(WeatherController.class);
    @GetMapping("weather/{temp}")
    public String wetherInfo(@PathVariable int temp){
        logger.info("Service-app:  WeatherController service wetherInfo is called");
        String result= "good weather "+ temp;
        logger.info("Service-app:  WeatherController service wetherInfo is finished");
        return result;
    }
}
