package com.empapp.basics;

import com.util.factory.SessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Objects;

public class B_ShowAll {
    public static void main(String[] args) {

        SessionFactory sessionFactory=
                SessionFactoryUtil.getSessionFactory();

        Session session=sessionFactory.openSession();
        //hib orm                                               HQL->SQL
//        List<Employee> list=session.createQuery("select e from Employee e", Employee.class).list();
//        list.forEach(System.out::println);

        //Projection operation
//        List<Integer> list=session.createQuery("select e.id from Employee e", Integer.class).list();
//        list.forEach(System.out::println);

//        List<Object[]> list=session
//                .createQuery("select e.id,e.salary from Employee e", Object[].class).list();
//
//        for(Object[] obj:list){
//            System.out.println(obj[0]+" "+obj[1]);
//        }

        //DTO give that dto to me i will populate the data
        List<EmployeeSelectedDataDto> list=session
                .createQuery("select new com.empapp.basics.EmployeeSelectedDataDto(e.name,e.salary) from Employee e", EmployeeSelectedDataDto.class).list();//select e.name,e.salary from Employee e", EmployeeSelectedDataDto.class).list();
        list.forEach(System.out::println);

        session.close();
        sessionFactory.close();

    }
}
