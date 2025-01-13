package com.threads.session3.juc_examples;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
    BlockingQueue<Integer>  q;

    public Producer( BlockingQueue<Integer>  q) {
        this.q = q;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e) {

                }
                q.put(++i);
                System.out.println("Put: "+ i+": "+ q.size());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable {
    BlockingQueue<Integer>  q;
    public Consumer( BlockingQueue<Integer>  q) {
        this.q = q;
    }
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("got: "+ q.take()+": "+ q.size());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class A_PandC {
    public static void main(String[] args) {
         BlockingQueue<Integer> q=new ArrayBlockingQueue<>(1);
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);

        Thread t1=new Thread(producer);
        Thread t2=new Thread(consumer);

        t1.start();
        t2.start();

        System.out.println("end");

    }
}
