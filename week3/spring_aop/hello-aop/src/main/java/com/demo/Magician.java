package com.demo;

import org.springframework.stereotype.Component;

//Proxy dp: static proxy vs dynamic proxy
@Component(value = "m")
public class Magician {

    public String doMagic(){
        System.out.println("abara ka dabra...");
        if(1==2){
            throw new MagicianHeartAttack("call Dr now!");
        }
        return "rabbit from the hat";
    }
    public void f1(){
        System.out.println("f1 method of magician");
    }
    public void f2(){
        System.out.println("f2 method of magician");
    }
    public void f3(){
        System.out.println("f3 method of magician");
    }

}
