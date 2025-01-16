package com.java8.session1.ex1.functional_interface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
//Predicate: Data -> true/false
public class A_Predicate {
    public static void main(String[] args) {

       //What is predicate? data -> true/false
//    	Predicate<Integer>predicateEven= x -> x%2==0;
//        System.out.println(predicateEven.test(7));

//    Predicate<String> nameContainRaj= s-> s.contains("raj");
//        System.out.println(nameContainRaj.test("rajiv"));

    	//rich emp : 60LPA
//    	Predicate<Employee>richEmp= e-> e.getSalary()>=60_00_00_0;
//        System.out.println(richEmp.test(new Employee(1,"raj",90_00_00_0)));

		//BiPredicate
        BiPredicate<Integer,Integer> biPreidate=(a, b)-> a>=b;
		
		
    }
}
