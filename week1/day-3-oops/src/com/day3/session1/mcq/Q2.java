package com.day3.session1.mcq;
class A{
    static void show(){
        System.out.println("show of class A");
    }
}
class B extends A{

    static void show(){
        System.out.println("show of class B");
    }
}
public class Q2 {
    public static void main(String[] args) {
        B a=new B();
        a.show();
    }
}
