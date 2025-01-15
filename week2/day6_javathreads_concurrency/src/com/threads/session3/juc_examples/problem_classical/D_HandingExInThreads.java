package com.threads.session3.juc_examples.problem_classical;

import java.io.BufferedReader;
import java.io.FileReader;
// java 1.4 : issues
//How to handle exception in threads?
class JobWithEx implements  Runnable{
    @Override
    public void run(){
        try(BufferedReader reader = 
        		new BufferedReader(new FileReader("foo.txt"))){
            String data=null;
            while ((data=reader.readLine())!=null){
                System.out.println(data);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
class CommonHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println(" common thread t "+ t.getName()+" got some exception "+ e);
    }
}

class ExHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("thread t "+ t.getName()+" got some exception "+ e);
    }
}
public class D_HandingExInThreads {

    public static void main(String[] args) {
    	//how to handle exception in threads
    	//UncaughtExceptionHandler
            Thread.setDefaultUncaughtExceptionHandler(new CommonHandler());
        	Thread t=new Thread(new JobWithEx(),"test1");
           // t.setUncaughtExceptionHandler(new ExHandler());
        	t.start();
        	

    	

    }
}
