package com.threads.session1.classical_threads;
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("some logic");
	}
	
}

public class A_CreatingUsingThread {
    public static void main(String[] args) {
    	System.out.println("Main job of thread: "+ Thread.currentThread().getName());

    	MyThread t=new MyThread();
    	t.start();
    	
    	System.out.println("Main job of thread done : "+ Thread.currentThread().getName());
    }
}
