package com.day5.session3;

import java.util.LinkedList;
import java.util.List;
class NewDog{
	public void sound() {
		System.out.println("bho bho");
	}
}
public class A_Intro_Generics {

	public static void main(String[] args) {
		//Why to use generics?
		//"Generics is type essared"
		//java 5+ 17
		List<String> list = new LinkedList<>();
		list.add("foo");
		list.add("bar");
		list.add("foo");
		list.add("apple");
		list.add("umesh");
		myFoo(list);
		for(String data: list) {
			System.out.println(data);
		}
	
			//dont mix wine with milk
			//dont gen and non gen
	}

	//java 4
	 static void myFoo(List list) {
		list.add(new NewDog());
	}
}
