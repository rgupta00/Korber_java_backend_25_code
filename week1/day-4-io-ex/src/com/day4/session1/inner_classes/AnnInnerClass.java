package com.day4.session1.inner_classes;

interface Cookable{
    void cook();
}
public class AnnInnerClass {
    public static void main(String[] args) {
        //Swing programming : Java 8
        Cookable cookable=new Cookable() {
            @Override
            public void cook() {
                System.out.println("home cooking");
            }
        };
        cookable.cook();
        Cookable cookable2=()-> System.out.println("hotel cooking");//java 8


        cookable2.cook();
    }
}
