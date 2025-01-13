package com.threads.session2.classical_threads;
// wait and notify pattern*

//FIFO (1)

class Q {
	int n;
	synchronized int get() {
		System.out.println("get: " + n);
		return n;
	}
	synchronized void put(int n) {
		this.n = n;
		System.out.println("put: " + n);
	}
}

class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        new Thread(this).start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;

    public Consumer(Q q) {
        this.q = q;
        new Thread(this).start();
    }

    @Override
    public void run() {

        while (true) {
            q.get();
        }
    }
}

public class A_PandC {
    public static void main(String[] args) {
        Q q = new Q();
        Producer producer = new Producer(q);
        Consumer consumer = new Consumer(q);

        System.out.println("end");

    }
}
