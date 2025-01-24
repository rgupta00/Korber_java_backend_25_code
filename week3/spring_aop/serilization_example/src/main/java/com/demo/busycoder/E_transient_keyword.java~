package com.busycoder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Collor{
	int size;
	public Collor() {
		System.out.println("ctr of collor is called");
	}
}
//we need to customized ser process? how 
class Dog2 implements Serializable{
	String dogName;
	transient Collor collor;
	
	
	//during ser
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();//hey jvm whatever u can do by default do that
		oos.writeInt(collor.size);
		
	}
	
	//during de-ser
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		collor=new Collor();
		collor.size=ois.readInt();
	}
}

public class E_transient_keyword {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Collor c=new Collor();
		c.size=11;
		
		Dog2 d2=new Dog2();
		d2.dogName="stonish";
		d2.collor=c;
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("foo.txt")));
		oos.writeObject(d2);
		System.out.println("done");
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("foo.txt")));
		
		Dog2 dog2=(Dog2) ois.readObject();
		System.out.println(dog2.dogName);
		Collor c2=dog2.collor;
		System.out.println(c2.size);
	}

}
