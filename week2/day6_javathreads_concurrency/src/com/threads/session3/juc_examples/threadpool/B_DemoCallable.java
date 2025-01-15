package com.threads.session3.juc_examples.threadpool;

import java.util.concurrent.*;

//factororial
class Factorial implements Callable<Long>{
    private long n;

    public Factorial(long n) {
        this.n = n;
    }

    @Override
    public Long call() throws Exception {
        if(n<0)
            throw new Exception("not possible to calcualte the fact...");
        long fact=1;
        for(long i=1;i<=n;i++){
            fact*=i;
        }
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){}
        return fact;
    }
}
public class B_DemoCallable {

    public static void main(String[] args)throws Exception {

        Factorial factorial=new Factorial(5);

        ExecutorService es= Executors.newSingleThreadExecutor();
        System.out.println(" before calling submit method");
        Future<Long> future= es.submit(new Factorial(10));
        System.out.println(" after calling submit method");


//        if(future.isDone()) {
//            long data = future.get();
//        }

//
        long data = future.get();
        System.out.println("we are getting the data");
        System.out.println(data);

        es.shutdown();
        es.awaitTermination(10, TimeUnit.MINUTES);

    }
}
