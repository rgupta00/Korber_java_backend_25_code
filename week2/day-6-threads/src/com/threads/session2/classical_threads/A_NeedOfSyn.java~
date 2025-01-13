package com.threads.session2.classical_threads;
//Printer ---> 3 employee : race condition
//expense earn thread
//t1 t2
class Foo{
	private Object lock1=new Object();
	private Object lock2=new Object();
	private int counter=0;
	
	//t1
	public  void a() {
		synchronized (lock1) {
			counter++;
		}
	}
	
	//t2
	public  void b() {
		synchronized (lock2) {
			counter--;
		}
	}
	
}
class Printer {
	//synchronized method vs synchronized block
	//Why any java object can act as a lock?
	//this vs any other other
	private Object lock=new Object();
	
	public  synchronized void print(String letter) {
		//
		//
		//CS
		synchronized (lock) {
			System.out.print("[");
			System.out.print(letter);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ex) {}
			System.out.println("]");
		}
		
		//
		//
		
	}
}

class Client implements Runnable{
	private String letter;
	private Printer printer;
	private Thread thread;
	public Client(String letter, Printer printer) {
		this.letter=letter;
		this.printer=printer;
		this.thread=new Thread(this);
		this.thread.start();
	}
	@Override
	public void run() {
		printer.print(letter);
	}
}

public class A_NeedOfSyn {
	public static void main(String[] args) {

		Printer printer = new Printer();
		Client raj=new Client("i love java", printer);
		Client ekta=new Client("i love cooking", printer);
		Client gunika=new Client("i love maths", printer);
		
		

	}
}
