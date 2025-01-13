package com.threads.session1.classical_threads;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.Thread.UncaughtExceptionHandler;

//How to handle exception in threads?
class JobWithEx implements  Runnable{
    @Override
    public void run(){
        try(BufferedReader reader = 
        		new BufferedReader(new FileReader("foo.txt"))){
            ///
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

public class D_HandingExInThreads {

    public static void main(String[] args) {
    	//how to handle exception in threads
    	//UncaughtExceptionHandler
    	try {
        	Thread t=new Thread(new JobWithEx(),"test1");
        	t.start();
        	
    	}catch(Exception e) {
    		System.out.println("ex is handled");
    	}
    	

    }
}
