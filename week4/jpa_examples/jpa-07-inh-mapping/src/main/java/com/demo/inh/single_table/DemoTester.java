package com.demo.inh.single_table;

import com.demo.factory.EmFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.*;
public class DemoTester {

	public static void main(String[] args) {


		EntityManagerFactory emf  = EmFactory.getEMFactory();
		EntityManager em = emf.createEntityManager();// getCurrentSession (web application spring)

		em.getTransaction().begin();
		
//		Account account1=new SavingAccount("ravi", 5600, .4);
//		Account account2=new CurrentAccount("umesh", 5600, 400);
////
//		session.save(account1);
//		session.save(account2);
//
		//it support poly quaries
		
		List<Account> accounts=em
				.createQuery("select a from Account a").getResultList();
		accounts.forEach(System.out::println);
//
		em.getTransaction().commit();
		

		em.close();

		emf.close();


	}

}
