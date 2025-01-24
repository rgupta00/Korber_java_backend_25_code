package com.demo.busycoder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MySingleton implements Serializable{
	private static MySingleton mySingleton = new MySingleton();

	private MySingleton() {
	}

	public static MySingleton getMySingleton() {
		return mySingleton;
	}
	private Object readResolve() {
		System.out.println("it is called");
		return mySingleton;
	}
}

public class L_SerAndSingleton {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		MySingleton mySingleton = MySingleton.getMySingleton();

		System.out.println(mySingleton.hashCode());

		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("foo.txt")));
		oos.writeObject(mySingleton);
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("foo.txt")));
		
		MySingleton mySingleton2 = (MySingleton) ois.readObject();
		System.out.println(mySingleton2.hashCode());
	}

}
