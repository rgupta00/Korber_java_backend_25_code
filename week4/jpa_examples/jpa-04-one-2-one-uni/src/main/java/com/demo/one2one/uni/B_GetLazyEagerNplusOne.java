package com.demo.one2one.uni;

import com.demo.factory.EmFactoryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;

public class B_GetLazyEagerNplusOne {
    public static void main(String[] args) {
        EntityManagerFactory emf= EmFactoryFactory.getEMFactory();
        EntityManager em=emf.createEntityManager();

        //JPQL
        //getting all parking object
//        List<Parking> parkings=
//                em.createQuery("select p from Parking p", Parking.class).getResultList();
////
////
//        System.out.println("---------------------------------");
//        for(Parking p: parkings){
//            System.out.println(p);
//            System.out.println("****************************");
//            System.out.println(p.getEmployee());
//        }

        //fetch join : solve N+1 problem==> total Quaries would be 1
//        List<Parking> parkings=
//                em.createQuery("from Parking p join fetch p.employee Employee", Parking.class).getResultList();
////
////
//        System.out.println("---------------------------------");
//        for(Parking p: parkings){
//            System.out.println(p);
//            System.out.println("****************************");
//            System.out.println(p.getEmployee());
//        }

        em.close();
        emf.close();
    }
}
