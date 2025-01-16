package com.java8.session2.ex6;

import java.util.function.LongBinaryOperator;
import java.util.stream.LongStream;

public class ParellelStreams {
    public static void main(String[] args) {
//        Accumulation vs Reduction
//       -------------------------


//       Let consider adding numbers from 1 to 1_000_000
        long sum=0;
        for(long i=0;i<=1_000_000;i++){
            sum=sum+i;
        }
        System.out.println(sum);


       // O/P: 500000500000

        //how to do using declartive data processing pipeline

        //What is the problem with below approach: Accumulation
        long []sumArr=new long[]{0L};

        LongStream.rangeClosed(1, 1_000_000).forEach(i->sumArr[0]+=i);

        System.out.println(sumArr[0]);

        //using :Reduction
//        long sum= LongStream.rangeClosed(1L, 1_000_000)
//                .parallel().reduce(0, (long x, long y) -> x+y);
//        System.out.println(sum);
    }
}
