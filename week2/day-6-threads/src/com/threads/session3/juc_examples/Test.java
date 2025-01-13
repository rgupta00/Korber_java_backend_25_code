package com.threads.session3.juc_examples;

import java.util.concurrent.atomic.AtomicInteger;

class R{
   // int i=0;
    AtomicInteger integer;

    public  void op(){
        //passimestic lock vs optmitic lock : java 5: AtomicInteger
          integer.compareAndSet(5000,0);//?
    }
}
class Test extends Thread {

   volatile boolean keepRunning = true;

    public void run() {
        while (keepRunning) {
//            synchronized (this){
//
//            }
            //System.out.println();
        }

        System.out.println("Thread terminated.");
    }

    public static void main(String[] args) throws InterruptedException {
        Test t = new Test();
        t.start();
        Thread.sleep(1000);
        t.keepRunning = false;
        System.out.println("keepRunning set to false.");
    }
}
