package com.demo.ex_handing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class B_CheckedEx {
    public static void main(String[] args){

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("data3.txt")));
            System.out.println("file not found");
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }

        System.out.println("-----------------");

    }
}
