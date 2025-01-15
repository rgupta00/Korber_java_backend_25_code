package com.threads.session1.classical_threads;

class Job implements Runnable{
    @Override
    public void run() {
        System.out.println("job started by the thread "+Thread.currentThread().getName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("job end by the thread "+Thread.currentThread().getName());

    }
}
public class A_CreatingUsingThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
        Job job=new Job();
        Thread thread1 = new Thread(job,"A");
        Thread thread2 = new Thread(job,"B");
        Thread thread3 = new Thread(job,"C");

        thread1.start();
        thread1.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("end");

    }
}
