package com.java8.ex_doubts;


import java.io.IOException;
import java.sql.SQLException;

class X{
    X()throws IOException{
        System.out.println("X constructor");
    }
}
class Y extends  X{
   Y() throws Exception{
           super();
       System.out.println("Y constructor");
   }
}

public class Demo {
    public static void main(String[] args) {
        try {
            X x=new Y();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
