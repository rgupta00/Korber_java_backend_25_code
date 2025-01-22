package com.empapp.basics;

import com.util.factory.SessionFactoryUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class A_AddEmployee {
    public static void main(String[] args) {
        //hello world to add a rec to the db

        //1. get the session factory
        SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();
        //2. get the session from the session factory
        Session session=sessionFactory.openSession();

        //3. u need to start the tx
        Transaction tx=session.getTransaction();
        try{
            tx.begin();
            Employee employee1=new Employee("sumit",6700,"IT");
            Employee employee2=new Employee("kapil",9700,"Training");
            Employee employee3=new Employee("Seema",9710,"Fin");
            session.persist(employee1);
            session.persist(employee2);
//            if(1==1)
//                throw  new RuntimeException();
            session.persist(employee3);

            tx.commit();
        }catch (HibernateException e){
            System.out.println(e);
            tx.rollback();
        }
        session.close();
        sessionFactory.close();


        //close the session
        //close the session factory


    }
}
