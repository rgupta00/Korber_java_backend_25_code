package com.empapp.basics;

import com.util.factory.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class C_GetById {
    public static void main(String[] args) {

        SessionFactory sessionFactory=SessionFactoryUtil.getSessionFactory();

        Session session=sessionFactory.openSession();

        Employee employee=session.get(Employee.class, 1);
        System.out.println(employee);
      //  session.evict(employee);

        Employee employee2=session.get(Employee.class, 1);
        System.out.println(employee2);
        session.close();
        sessionFactory.close();



    }
}
