package com.demo.serilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeSer {
    public static void main(String[] args) {
        try{
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("demo.ser")));
            Account account=(Account) ois.readObject();
            System.out.println(account);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
