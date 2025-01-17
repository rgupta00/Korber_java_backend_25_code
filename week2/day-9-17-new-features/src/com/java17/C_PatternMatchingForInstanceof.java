package com.java17;

public class C_PatternMatchingForInstanceof {
    public static void main(String[] args) {
        //Pattern Matching for instanceof
       // Object data="java";

//        if(data instanceof String){
//            String s=(String) data;
//            System.out.println(s.length());
//        }
//        if(data instanceof String s){
//            System.out.println(s.length());
//        }

        Object data="i love java ...";
        if(data instanceof String dataString && dataString.length()>10){
            System.out.println(dataString);
        }else {
            System.out.println("something else");
        }
    }
}
