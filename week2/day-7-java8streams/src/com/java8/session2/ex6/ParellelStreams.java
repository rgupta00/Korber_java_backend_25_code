package com.java8.session2.ex6;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.stream.LongStream;

public class ParellelStreams {
    public static void main(String[] args) {
//        Accumulation vs Reduction
//       ------------------------
//       Let consider adding numbers from 1 to 1_000_000
//        long sum=0;
//        for(long i=0;i<=1_000_000;i++){
//            sum=sum+i;
//        }
//        System.out.println(sum);


       // O/P: 500000500000
        //how to do using declartive data processing pipeline
        //What is the problem with below approach: Accumulation
//        long start=System.currentTimeMillis();
//        long []sumArr=new long[]{0L};
//        //int sumData=0;
//        LongStream.rangeClosed(1, 1_000_000)
//                .parallel()
//                .forEach(new LongConsumer() {
//                    @Override
//                    public void accept(long i) {
//                        synchronized (this){
//                            sumArr[0]+=i;
//                        }
//                    }
//                });
//        long end=System.currentTimeMillis();
//        System.out.println("time taken "+ (end-start)+" ms");
//        System.out.println(sumArr[0]);



        //using :Reduction
        long start=System.currentTimeMillis();
        long sum=LongStream.rangeClosed(1, 1_000_000_00)
                .parallel()
                .reduce(0, ( x,  y)-> x+y);
        System.out.println(sum);
        long end=System.currentTimeMillis();
        System.out.println("time taken "+ (end-start)+" ms");


//        long sum= LongStream.rangeClosed(1L, 1_000_000)
//                .parallel().reduce(0, (long x, long y) -> x+y);
//
    }
}
