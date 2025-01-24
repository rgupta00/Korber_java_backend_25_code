package com.demo.busycoder;

import java.io.Serializable;

public class Account3 implements Serializable{
	private static final long serialVersionUID = -6587257583056865791L;
	int id;
	String name;
	double balance;
	double discount;
	public Account3() {
		System.out.println("ctr of account class");
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
