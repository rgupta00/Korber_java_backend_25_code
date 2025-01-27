package com.empapp.basics;

import com.util.factory.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class A_InsertRecords {
    public static void main(String[] args) {
        //hello world of hiber
        //1. obtain session factory
        SessionFactory sessionFactory=
                SessionFactoryUtil.getSessionFactory();
        //2. From SF get the object of "Session"
        Session session=sessionFactory.openSession();
        //3. create object of Employee class
        Employee emp=new Employee("Umesh", 5800, "Sales");
        Employee emp2=new Employee("Indu", 6000, "MKT");


        //4. create transaction
        Transaction tx=session.getTransaction();

        try{
            tx.begin();
            //5. save the object
            session.persist(emp);//ORM
            session.persist(emp2);

            tx.commit();
        }catch (Exception e){
            tx.rollback();
            e.printStackTrace();
        }finally {
            session.close();
            sessionFactory.close();
        }
        session.close();
        sessionFactory.close();

    }
}
