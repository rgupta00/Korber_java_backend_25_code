package com.java8.session1.ex0.interface_evolutions;
interface X{
    default void foof(){
        System.out.println("foof of interface X");
    }
}
interface Y{
    default void foof(){
        System.out.println("foof of interface Y");
    }
}
class M implements X, Y{
    public void foof(){
        X.super.foof();
        Y.super.foof();
        System.out.println("overriden");
    }
}
public class A1_InterfaceEvolutionDiamondProblem {
    public static void main(String[] args) {
    Y x=new M();
    x.foof();
    }
}
