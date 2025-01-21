package com.empapp.basics;

import com.util.factory.SessionFactoryUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class D_EmployeeUpdate {
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
            Employee employee=session.get(Employee.class, 1);
            employee.setSalary(employee.getSalary()*1.2);
            employee.setName("kavita");
            session.persist(employee);
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
