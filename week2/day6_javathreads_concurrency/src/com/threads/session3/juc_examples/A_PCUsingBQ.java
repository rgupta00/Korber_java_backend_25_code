package com.threads.session3.juc_examples;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class A_PCUsingBQ {

    private static BlockingQueue<Integer> blockingQueue=new ArrayBlockingQueue<>(10);

    public static void main(String[] args) {

        //P
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"P");

        //C
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        },"C");

        t1.start();
        t2.start();


    }


    private static void consume()throws InterruptedException {
        while (true) {
            Thread.sleep(1000);
            System.out.println("got: "+ blockingQueue.take()+": "+ blockingQueue.size());
        }
    }

    private static void produce()throws InterruptedException {
        Random r=new Random();
        while (true){
            Integer val=r.nextInt(100);
            blockingQueue.put(val);
            System.out.println("Put: "+ val+": "+ blockingQueue.size());

        }
    }
}




