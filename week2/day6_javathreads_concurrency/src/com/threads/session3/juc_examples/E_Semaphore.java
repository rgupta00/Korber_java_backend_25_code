package com.threads.session3.juc_examples;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

class SlowApi{
    public static String getWeather(int temp){
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){}
        return "good";
    }
}
class Task implements Runnable{
    private Semaphore semaphore;

    public Task(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        semaphore.acquireUninterruptibly();
        SlowApi.getWeather(20);
        semaphore.release();
    }
}
public class E_Semaphore {
    public static void main(String[] args) throws Exception{

        Semaphore semaphore=new Semaphore(3);

        ExecutorService es= Executors.newFixedThreadPool(50);

        IntStream.of(1000).forEach(i-> es.execute(new Task(semaphore)));

        es.shutdown();
        es.awaitTermination(1, TimeUnit.MINUTES);
    }
}
