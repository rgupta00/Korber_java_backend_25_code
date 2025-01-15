package com.threads.session3.juc_examples.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduledJob implements Runnable{
    @Override
    public void run() {
        System.out.println("some ScheduledJob job");
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){}
    }
}
public class C_ScheduleThreadPool {
    public static void main(String[] args) {

        ScheduledExecutorService es= Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors());

//        es.schedule(new ScheduledJob(),1, TimeUnit.SECONDS);

     //es.scheduleWithFixedDelay(new ScheduledJob(),2,4, TimeUnit.SECONDS);
        es.scheduleAtFixedRate(new ScheduledJob(),2,4, TimeUnit.SECONDS);
       // es.shutdown();


    }
}
