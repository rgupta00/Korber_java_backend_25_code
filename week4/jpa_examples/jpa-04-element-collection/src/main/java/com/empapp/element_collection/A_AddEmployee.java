package com.empapp.element_collection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class A_AddEmployee {
    public static void main(String[] args) {
        //hello world to add a rec to the db
        //1. get the EnittyManager factory
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("busycoder");

        //2. get the session from the EntityManager
        EntityManager em=emf.createEntityManager();

        //3. u need to start the tx
        EntityTransaction tx=em.getTransaction();


        try{
            tx.begin();

            Employee employee1=new Employee("raj",6700,"IT");
            employee1.addEmail("raj@gmail.com");
            employee1.addEmail("raj@hotmail.com");
            em.persist(employee1);

            tx.commit();
        }catch (Exception e){
            e.printStackTrace();
        }

        em.close();
        emf.close();




    }
}
