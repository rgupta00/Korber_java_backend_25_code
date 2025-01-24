package com.demo.busycoder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//instance control flow

//Case 1: when base class itself is Serializable
//Case 2: when base class is not Serializable--instance control flow--InvalidClassException

class A {
	int i=10;
	A(int i){
		System.out.println("ctr of class A");
	}
}
class B extends A implements Serializable{
	int k=11;
	B(){
		super(9);
		System.out.println("ctr of class B");
	}
}
public class H_Serialization_with_inheritance {

	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		B b=new B();
		b.i=22;
		b.k=55;
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("foo.txt")));
		oos.writeObject(b);
		System.out.println("done");
		
		//de-ser
		System.out.println("---------------------");
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("foo.txt")));
		B ob2=(B) ois.readObject();
		
		System.out.println(ob2.i);
		System.out.println(ob2.k);
		
	}
}
