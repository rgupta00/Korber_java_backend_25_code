package com.demo;

public class CityApi {
    public String getCity(int id){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException ex){}
        return "delhi";//db
    }
}
