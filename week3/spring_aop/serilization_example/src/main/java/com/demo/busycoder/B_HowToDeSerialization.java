package com.demo.busycoder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class B_HowToDeSerialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		//De-Ser

		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("foo.txt")));
		Account acc=(Account) ois.readObject();
		System.out.println(acc.bankName);
		System.out.println(acc);
		
	}
}

