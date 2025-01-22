package com.empapp.embedded;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;


public class B_ShowAll {
    public static void main(String[] args) {
        //hello world to add a rec to the db
        //1. get the EnittyManager factory
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("busycoder");

        //2. get the session from the EntityManager
        EntityManager em=emf.createEntityManager();


        List<Employee>employeeList=em.createQuery("select e from Employee e", Employee.class).getResultList();
        employeeList.forEach(e-> System.out.println(e));

        em.close();
        emf.close();




    }
}
