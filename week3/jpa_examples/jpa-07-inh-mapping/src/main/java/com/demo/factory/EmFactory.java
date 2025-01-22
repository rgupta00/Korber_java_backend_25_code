package com.demo.factory;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmFactory {
	private static EntityManagerFactory factory=null;
	
	private EmFactory() {}
	
	public static EntityManagerFactory getEMFactory() {
		EntityManagerFactory emf=
				Persistence.createEntityManagerFactory("busycoder");
		return emf;
	}
	
}
