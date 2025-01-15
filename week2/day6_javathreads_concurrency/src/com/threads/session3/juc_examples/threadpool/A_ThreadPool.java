package com.threads.session3.juc_examples.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class CpuIntesiveJob implements Runnable{
    @Override
    public void run() {
        System.out.println("some cup intesive java");
    }
}

class IoIntesiveJob implements Runnable{
    @Override
    public void run() {
        System.out.println("some io intesive java");
    }
}
public class A_ThreadPool {
    public static void main(String[] args) throws Exception{


        ExecutorService es= Executors.newFixedThreadPool(100);

        for(int i=0;i<100;i++){
            es.submit(new IoIntesiveJob());
        }

        es.shutdown();

        es.awaitTermination(1, TimeUnit.MINUTES);

//        int noOfCors=Runtime.getRuntime().availableProcessors();
//        ExecutorService es= Executors.newFixedThreadPool(noOfCors);
//
//        for(int i=0;i<10;i++){
//            es.submit(new CpuIntesiveJob());
//        }
//
//       es.shutdown();
//
//       es.awaitTermination(1, TimeUnit.MINUTES);


    }
}
