package com.threads.session3.juc_examples.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class CpuIntisiveJob implements Runnable{
    @Override
    public void run() {
        System.out.println("some cpu intensive job");
    }
}
public class DemoTP {
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        es.submit(new CpuIntisiveJob());
        es.shutdown();
        try {
            es.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
