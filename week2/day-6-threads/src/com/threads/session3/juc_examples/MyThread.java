package com.threads.session3.juc_examples;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

//fail fast :Vector and hashtable ConcurrentModificationException
public class MyThread extends Thread{
    //static Vector<String> list = new Vector<String>();
    static CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();

    public void run(){
        try{
            Thread.sleep(300);
        }catch (InterruptedException e){}
        list.add("D");
    }

    public static void main(String[] args) {
        list.add("A");
        list.add("B");
        list.add("C");

        MyThread t=new MyThread();
        t.start();
        Iterator<String> it=list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
          try{
              Thread.sleep(200);
          }catch (InterruptedException e){}
        }

        System.out.println("---------------");
        System.out.println(list);

    }
}
