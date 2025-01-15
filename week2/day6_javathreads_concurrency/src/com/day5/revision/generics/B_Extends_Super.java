package com.day5.revision.generics;

import java.util.LinkedList;
import java.util.List;
class Dog1 extends  Object{
	public void bark(){
		System.out.println("barking");
	}
}
// super vs extends : generics 
public class B_Extends_Super {

	public static void main(String[] args) {

		List<? extends Object> list6 = new LinkedList<Dog1>();


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
		List<Dog1> list5 = new LinkedList<>();
		list5.add(new Dog1());


		print(list5);

//		List<Float> list3 = new LinkedList<>();
//		list3.add(8.7f);
//		list3.add(19.7F);
//
//		print(list3);
//
//		List<NewDog> list4 = new LinkedList<>();
//		list4.add(new NewDog());
//		list4.add(new NewDog());
//
//		print(list4);

	}
//PE CS
	//univeral printer
	public static  void print(List<? extends Object> list){
		for(Object temp: list){
			System.out.println(temp);
		}
	}

}
