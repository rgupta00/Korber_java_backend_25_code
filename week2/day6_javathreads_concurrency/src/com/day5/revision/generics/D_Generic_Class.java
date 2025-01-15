package com.day5.revision.generics;

import java.lang.reflect.Array;

//class Foo<T> {
//	T i;
//
//	public T getI() {
//		return i;
//	}
//
//	public void setI(T i) {
//		this.i = i;
//	}
//}
class Bar<T1, T2> {
	T1 i;
	T2 j;

	public T1 getI() {
		return i;
	}

	public void setI(T1 i) {
		this.i = i;
	}

	public T2 getJ() {
		return j;
	}

	public void setJ(T2 j) {
		this.j = j;
	}
}

//9958543978


class UnderFlowEx extends RuntimeException{}
class OverFlowEx extends RuntimeException{}
class Stack<T> {
	private T x[];
	private final int SIZE;
	private int top;

	public Stack(Class<T> clazz, int capacity) {
		x = (T[])Array.newInstance(clazz, capacity);
		SIZE = capacity;
		top = -1;
	}

	public void push(T element) {
		if (top >= SIZE)
			throw new OverFlowEx();
		else
			x[++top] = element;
	}

	public T pop() {
		if (top == -1)
			 throw new UnderFlowEx();
		else
			return x[top--];
	}
}

//Template classes
//gen classs
//stack int, stack double , stack employee
public class D_Generic_Class {

	public static void main(String[] args) {

//		Stack<Integer> s=new Stack<>(Integer.class, 10);
//		s.push(2);
//		System.out.println(s.pop());
		
//		Stack<String> s=new Stack<>(String.class, 10);
//		s.push("foo");
//		System.out.println(s.pop());
		
//		Foo<String> foo=new Foo<>();
//		foo.setI("foo");
//		System.out.println(foo.getI());
//		
		
//		Foo<Integer> foo=new Foo<>();
//		foo.setI(3);
//		System.out.println(foo.getI());
		Bar<Integer, Double> bar=new Bar<>();
	}
}
