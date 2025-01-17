package com.java9.features;

class Cal{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    int add( int ...a){
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        return sum;
    }
}
public class D1_VariableArg {
    public static void main(String[] args) {
        //java 1.5, variable arg method
        Cal cal=new Cal();
        System.out.println(cal.add(3,5,6,7,8));
    }
}
