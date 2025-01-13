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
        /*
        what is thread pool? adv? typre of thread pool?
         */
        int coreCount=Runtime.getRuntime().availableProcessors();
        System.out.println(coreCount);

        ExecutorService es= Executors.newFixedThreadPool(coreCount);

        for(int i=0;i<100; i++){
           // es.submit(new IoIntesiveJob());
           es.execute(new CpuIntesiveJob());
        }
        es.shutdown();// no forther job for you

        es.awaitTermination(10, TimeUnit.MINUTES);
    }
}
