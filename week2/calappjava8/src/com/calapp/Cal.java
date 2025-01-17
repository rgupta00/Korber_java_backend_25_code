package com.calapp;

import com.internallogic.CalLogic;

public class Cal {
    private CalLogic calLogic=new CalLogic();
    public int add(int a, int b){
        return calLogic.add(a,b);
    }
}
