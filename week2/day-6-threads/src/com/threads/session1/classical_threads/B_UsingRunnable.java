package com.threads.session1.classical_threads;

//Creating thread with extends Thread class
//InterruptedException IllegalMonitorStateException

//class MyJob implements Runnable {
//}

public class B_UsingRunnable {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main  started by the thread: " + Thread.currentThread().getName());

		System.out.println("main  end by the thread: " + Thread.currentThread().getName());

	}
}
