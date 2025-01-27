package com.empapp.basics;

import com.util.factory.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class C_Update {
    public static void main(String[] args) {
        //hello world of hiber
        //1. obtain session factory
        SessionFactory sessionFactory=
                SessionFactoryUtil.getSessionFactory();
        //2. From SF get the object of "Session"
        Session session=sessionFactory.openSession();

        Employee emp=session.get(Employee.class, 7);


        //4. create transaction
        Transaction tx=session.getTransaction();

        try{
            tx.begin();
            emp.setSalary(emp.getSalary()+500);
            session.update(emp);
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
