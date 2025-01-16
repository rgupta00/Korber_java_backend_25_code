package com.java8.session1.ex0.why_java8;
import java.util.stream.LongStream;
//declartive data processing, SQL
class Prime {
    public static boolean isPrime(Long n) {
        boolean isPrimeNumber = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                isPrimeNumber = false;
        }
        return isPrimeNumber;
    }
}
public class WhyJava8 {
    public static void main(String[] args) {
        //1 to 1_000_000
        long start=System.currentTimeMillis();
        long count= LongStream.rangeClosed(1,10000)
                .parallel()
                .filter(Prime::isPrime)
                .count();
        System.out.println(count);
        long end=System.currentTimeMillis();
        System.out.println(end-start+" ms");


    }
}
