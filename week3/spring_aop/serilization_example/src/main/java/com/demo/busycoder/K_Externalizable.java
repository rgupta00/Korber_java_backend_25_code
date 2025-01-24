package com.demo.busycoder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class K_Externalizable {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Account2 account=new Account2();
		account.id=4;
		account.name="raj";
		account.balance=5000.0;
		account.bankName="abc bank";
		//ser
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("foo.txt")));
		oos.writeObject(account);
		System.out.println("done");
		
	}
}
