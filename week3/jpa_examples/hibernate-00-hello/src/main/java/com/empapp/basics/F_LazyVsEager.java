package com.empapp.basics;

import com.util.factory.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class F_LazyVsEager {
    public static void main(String[] args) {

        //

        SessionFactory sessionFactory=
                SessionFactoryUtil.getSessionFactory();

        Session session=sessionFactory.openSession();

        //get vs load : "joins"
        Employee employee=session.load(Employee.class, 1);
        System.out.println("query is fired");
        session.close();

        System.out.println(employee);



        sessionFactory.close();

    }
}
