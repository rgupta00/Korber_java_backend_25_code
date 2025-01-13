package demo.java8.session1.ex0.interface_evolutions;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
@FunctionalInterface
interface Food{
	public void cook();
	
	public default  void fooDefault() {
		System.out.println("foo default method");
	}
	
	public static  void fooStatic() {
		System.out.println("foo stataic method");
	}
}

public class D_LambdaExp {
	public static void main(String[] args) {
		
		Food d=()-> System.out.println("hello to hotel food");
		
		d.cook();
		
	}
}


