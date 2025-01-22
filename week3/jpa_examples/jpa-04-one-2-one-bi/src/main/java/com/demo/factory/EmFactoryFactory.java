package com.demo.factory;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class EmFactoryFactory {
	private static EntityManagerFactory factory=null;
	
	private EmFactoryFactory() {}
	
	public static EntityManagerFactory getEMFactory() {
		EntityManagerFactory emf=
				Persistence.createEntityManagerFactory("busycoder");
		return emf;
	}
	
}
