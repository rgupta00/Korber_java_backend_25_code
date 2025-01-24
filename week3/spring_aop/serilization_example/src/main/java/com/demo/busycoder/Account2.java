package com.demo.busycoder;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Account2 implements Externalizable {
	int id;
	String name;
	double balance;
	static String bankName = "SBI";

	public Account2() {
		System.out.println("ctr of account class");
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(name);
		out.writeDouble(balance);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id=in.readInt();
		name=(String) in.readObject();
		balance=in.readDouble();
		
	}

}
