package com.demo.one2many;

import java.util.*;

import com.demo.factory.EmFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class DemoTester {

	public static void main(String[] args) {

		Department department1 = new Department("IT");
		Department department2 = new Department("sales");
		Department department3 = new Department("mkt");
		Department department4 = new Department("r&d");

		Employee employee1 = new Employee("raja");
		Employee employee2 = new Employee("amit");
		Employee employee3 = new Employee("sumit");
		Employee employee4 = new Employee("ekta");

		Employee employee5 = new Employee("keshav");
		Employee employee6 = new Employee("gunika");
		Employee employee7 = new Employee("rajiv");

		department1.getEmployees().add(employee1);
		department1.getEmployees().add(employee2);

		department2.getEmployees().add(employee3);
		department2.getEmployees().add(employee4);

		department3.getEmployees().add(employee5);
		department3.getEmployees().add(employee6);
		department3.getEmployees().add(employee7);

		employee1.setDepartment(department1);
		employee2.setDepartment(department1);

		employee3.setDepartment(department2);
		employee4.setDepartment(department2);

		employee5.setDepartment(department3);
		employee6.setDepartment(department3);
		employee7.setDepartment(department3);

		
		EntityManagerFactory emf  = EmFactory.getEMFactory();

		EntityManager em  = emf.createEntityManager();// getCurrentSession (web application spring)

		em.getTransaction().begin();

		Department department=em.find(Department.class,1);
		em.remove(department);// all the emp of that dep shold be deleted

//		em.persist(department1);
//		em.persist(department2);
//		em.persist(department3);
//		em.persist(department4);
////
//		em.persist(employee1);
//		em.persist(employee2);
//		em.persist(employee3);
//		em.persist(employee4);
//		em.persist(employee5);
//		em.persist(employee6);
//		em.persist(employee7);

		em.getTransaction().commit();

//		List<Department> departments=em
//				.createQuery("select d from Department d", Department.class)
//				.getResultList();
//
//		System.out.println("*********************");
//		for(Department dept:departments ) {
//			System.out.println("---------------");
//			System.out.println(dept.getDetpName());
//			System.out.println("-------------------");
//			for(Employee e: dept.getEmployees()) {
//				System.out.println(e.getEmpName());
//			}
//		}

//		List<Department> departments=session
//				.createQuery("from Department d join fetch d.employees Employee")
//				.getResultList();




		//Using fetch join
		
//		List<Department> departments=session
//				.createQuery("from Department d join fetch d.employees Employee")
//				.getResultList();
//

		
		
		em.close();

		emf.close();

	}

}
