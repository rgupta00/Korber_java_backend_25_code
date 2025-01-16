package com.java8.session1.ex0.interface_evolutions;
//What is functional interface in core java
//java 8
//if a inteface have only one abstract method => then it called functional interface, SAM

//"lambda expression" is "only" suppored in functional interface

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

@FunctionalInterface
interface Cal{
	int add(int a, int b);
	public default void foo(){
		System.out.println("it is a foo method of Cal interface");
	}
}

public class C_DemoFuncationalInterface {
	public static void main(String[] args) {


		//Ann inner class
//		Cal cal=new Cal() {
//			@Override
//			public int add(int a, int b) {
//				return a+b;
//			}
//		};
//		System.out.println(cal.add(3,1));

		//using lamabda expression
		//Cal cal=peice of code (functional prograamming)

		Cal cal=( a , b)-> a+b;
		System.out.println(cal.add(4,5));

		Runnable runnable=()-> System.out.println("job of the thread");
			//in java 8 i can pass a function into a method call
		//higher order function: also supported in java
		//only declartive data processing
		Thread t=new Thread(()-> System.out.println("job of the thread"));

		List<String> students=new LinkedList<>();
		students.add("raj");
		students.add("sumit");
		students.add("kapil");
		students.add("ekta");
		Collections.sort(students, ( o1,  o2)-> o2.compareTo(o1));
		System.out.println(students);

	}
}


