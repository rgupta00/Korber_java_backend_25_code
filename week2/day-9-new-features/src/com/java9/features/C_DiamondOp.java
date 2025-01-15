package com.java9.features;
import com.pojo.Book;

import java.sql.Array;
import  java.util.*;
class A{
        void foo(){
            System.out.println("foo of class A");
        }
}
class B extends  A{
    void foo(){
        System.out.println("foo of class B override");
    }
}
public class C_DiamondOp {
    public static void main(String[] args) {
//        A a=new A(){
//            @Override
//            void foo(){
//                System.out.println("foo of class A override");
//            }
//        };
//        ArrayList<A> aList=new ArrayList<>(){
//            Override
//            public void trimToSize() {
//                System.out.println("trim to size is overriden");
//            }
//        };
//        aList.trimToSize();;


        //List<String> strings=new ArrayList<String>();
        //Map<String, List<Book>> stringListMap=new HashMap<String, List<Book>>();
       // Map<String, List<Book>> stringListMap=new HashMap<>();

        //java 7
        //List<String> strings=new ArrayList<>();
        //ann inner class
//        List<String> strings2=new ArrayList<String>(){
//
//        };

        List<String> strings2=new ArrayList<>(){
        // u can override some / all method of arrayList
        };
    }
}
