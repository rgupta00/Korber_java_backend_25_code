package com.empapp.basics;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.List;

public class B_GetAll {
    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("busycoder");
        EntityManager em=emf.createEntityManager();

        EntityTransaction tx=em.getTransaction();

        List<Employee> employees=em.createQuery("select e from Employee e", Employee.class).getResultList();

        em.close();
        emf.close();




        //close the session
        //close the session factory


    }
}
