package com.threads.session1.classical_threads;

class MyThread extends Thread{
	public void run() {
		System.out.println("thread started by the thread: " + Thread.currentThread().getName());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		System.out.println("thread end by the thread: " + Thread.currentThread().getName());
	}
}

public class B_UsingThreadClass {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main  started by the thread: " + Thread.currentThread().getName());

		MyThread t=new MyThread();
		t.start();



		System.out.println("main  end by the thread: " + Thread.currentThread().getName());

	}
}
