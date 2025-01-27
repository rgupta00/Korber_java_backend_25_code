package com.empapp.basics;

import com.util.factory.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class E_Cache {
    public static void main(String[] args) {

        //

        SessionFactory sessionFactory=
                SessionFactoryUtil.getSessionFactory();

        Session session=sessionFactory.openSession();

        Employee employee=session.get(Employee.class, 1);
        System.out.println(employee);

        session.evict(employee);//hey hib remove the object from cache

        Employee employee2=session.get(Employee.class, 1);
        System.out.println(employee2);

        session.close();
        sessionFactory.close();

    }
}
