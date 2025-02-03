package com.wclient.wclient.serviceproxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="weather-service", url="localhost:8082")
public interface WeatherServiceProxy {
    @GetMapping(path = "/wservice/weatherservice/{temp}")
    public String getWeatherInfo(@PathVariable int temp);
}
