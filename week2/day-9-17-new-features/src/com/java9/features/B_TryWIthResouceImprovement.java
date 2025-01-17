package com.java9.features;

import java.util.InputMismatchException;
import java.util.Scanner;
class DoSideWork implements AutoCloseable{
    public DoSideWork(){
        System.out.println("crt of DoSideWork");
    }
    void doSideWork(){
        System.out.println("doing side work");
    }
    @Override
    public void close() throws Exception {
        System.out.println("closing side work");
    }
}
class Work implements AutoCloseable{
    public Work(){
        System.out.println("ctr of work");
    }
    void doWork(){
        System.out.println("doing main work");
    }

    @Override
    public void close() throws Exception {
        System.out.println("close ");
    }
}
public class B_TryWIthResouceImprovement {
    public static void main(String[] args) {

    }
}
