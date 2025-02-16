package com.threads.session3.juc_examples.ds_java5;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class Employee{
    private int id;
    private List<String> phones;
    public int getId() {
        return id;
    }
    public List<String> getPhones() {
        return Collections.unmodifiableList(phones);
       // return new ArrayList<>(phones);
    }

}
public class C_ThreadSafeDS {
    public static void main(String[] args) {


        //u can make any existing collection as thread safe
        // ,... vector, hashtable: ConcurrentMOdificationException
//        Vector<String> vector=new Vector<>();
//        vector.add("foo");


        //java 5: COWAL, CHM
        List<String> list=Collections.synchronizedList(new LinkedList<>());

//
//        //returning a copy of the collection
//
//        List<String> list2=new LinkedList<>();
//
//        //read only copy
//        List<String> list3=Collections.unmodifiableList(list2);
//        list3.add("foo");

    }
}
