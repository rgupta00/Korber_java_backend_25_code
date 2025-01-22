package com.empapp.basics;

import com.util.factory.SessionFactoryUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class E_DelEmployee {
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
          //pls try
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
