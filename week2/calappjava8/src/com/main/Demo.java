package com.main;

import com.calapp.Cal;
import com.internallogic.CalLogic;

public class Demo {
    public static void main(String[] args) {
        Cal cal=new Cal();
        CalLogic calLogic=new CalLogic();
        System.out.println(calLogic.add(3,6));
        System.out.println(cal.add(10,20));
    }
}
