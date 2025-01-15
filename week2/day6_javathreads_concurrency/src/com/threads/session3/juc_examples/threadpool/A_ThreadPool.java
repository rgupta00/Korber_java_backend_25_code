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


    }
}
