package com.day5.session3;

import java.util.LinkedList;
import java.util.List;

// super vs extends : generics 
public class B_Extends_Super {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(8);
		list.add(19);
		list.add(22);
		list.add(21);

		print(list);

		List<Double> list2 = new LinkedList<>();
		list2.add(8.9);
		list2.add(19.7);
		list2.add(22.4);
		list2.add(21.0);

		print(list2);
		List<Float> list3 = new LinkedList<>();
		list3.add(8.7f);
		list3.add(19.7F);
		
		print(list3);
		
		List<NewDog> list4 = new LinkedList<>();
		list4.add(new NewDog());
		list4.add(new NewDog());
		
		print(list4);

	}
	//<?> ===List<? extends Object> list
	private static void print(List<?> list) {
		for (Object val : list) {
			System.out.println(val);
		}
	}
	
//	private static void print(List<? extends Object> list) {
//		for (Object val : list) {
//			System.out.println(val);
//		}
//	}
	
//	private static void print(List<? extends Number> list) {
//		for (Number val : list) {
//			System.out.println(val);
//		}
//	}

//Erasure of method print(List<Integer>) is the same as
	// another method in type B_Extends_Super

//	//DRY
//	private static void printInt(List<Integer> list) {
//		for (Integer val : list) {
//			System.out.println(val);
//		}
//	}
//
//	private static void printDouble(List<Double> list) {
//		for (Double val : list) {
//			System.out.println(val);
//		}
//	}
}
