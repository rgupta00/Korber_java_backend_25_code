package com.day4.assignment;

public class SplitDemo {
    public static void main(String[] args) {
        String line="i love teaching";
        //StringTokenization
        String tokens[]=line.split(" ");
        for(String token: tokens){
            System.out.println(token);
        }

    }
}
