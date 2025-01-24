package com.demo.busycoder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class M_serial_Version_id {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Account3 account=new Account3();
		account.id=4;
		account.name="raj";
		account.balance=5000.0;
		//ser
//		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("foo.txt")));
//		oos.writeObject(account);
//		System.out.println("done");
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("foo.txt")));
		Account3 acc=(Account3) ois.readObject();
		System.out.println(acc);
	}
}
