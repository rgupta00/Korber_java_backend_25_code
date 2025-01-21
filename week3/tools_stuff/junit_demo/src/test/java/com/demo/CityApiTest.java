package com.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class CityApiTest {

    private CityApi cityApi;
    @BeforeEach
    void setUp() {
        cityApi=new CityApi();
    }
    @Test
    public void getCityTestPerformance(){
        assertTimeout(Duration.ofMillis(3000),()-> cityApi.getCity(55));
    }
    @Test
    public void getCityTestNotNull(){
        assertNotNull(cityApi.getCity(55));
    }
    @AfterEach
    void tearDown() {
        cityApi=null;
    }

}