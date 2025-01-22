package com.empapp.basics;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transaction;

public class A_AddEmployee {
    public static void main(String[] args) {
        //SessionFactory --- EntityMangerFactor
        //session---------------- entitymanager
        //save  persist
        //update    merge
        //delete  remove

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("busycoder");
        EntityManager em=emf.createEntityManager();

        EntityTransaction tx=em.getTransaction();
        try{
            tx.begin();
            Employee employee1=new Employee("sumit",6700,"IT");
            Employee employee2=new Employee("kapil",9700,"Training");
            Employee employee3=new Employee("Seema",9710,"Fin");

            em.persist(employee1);
            em.persist(employee2);

            tx.commit();
        }catch (Exception e){
            System.out.println(e);
            tx.rollback();
        }
        em.close();
        emf.close();




        //close the session
        //close the session factory


    }
}
