package com.demo.busycoder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{}

class Cat implements Serializable{}
class Rat implements Serializable{}

public class D_We_have_to_maintain_order_while_doing_de_serialization {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Dog d=new Dog();
		Cat c=new Cat();
		Rat r=new Rat();
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("foo.txt")));
		oos.writeObject(d);
		oos.writeObject(c);
		oos.writeObject(r);

		System.out.println("done");
		

		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("foo.txt")));
		Cat c1=(Cat) ois.readObject();
		
		Rat r1=(Rat) ois.readObject();
		
		Dog d1=(Dog) ois.readObject();
		
		
		System.out.println("de-ser done");
		
	}

}
