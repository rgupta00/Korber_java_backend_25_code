package com.demo.serilization;

import java.io.*;

public class DemoSer {
    public static void main(String[] args) {
        //serialization
        try{
            Account account=new Account(1,40000);
            ObjectOutputStream oos=new ObjectOutputStream
                    (new FileOutputStream(new File("demo.ser")));
            oos.writeObject(account);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
