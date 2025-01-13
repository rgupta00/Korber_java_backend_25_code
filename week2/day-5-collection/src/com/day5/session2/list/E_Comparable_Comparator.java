package com.day5.session2.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class E_Comparable_Comparator {

	public static void main(String[] args) {
		List<Employee> employees=new LinkedList<>();
	
		employees.add(new Employee(189, "Ekta", 2200));
		employees.add(new Employee(51, "Ramesh", 3000));
		employees.add(new Employee(81, "Ramesh", 3000));
		employees.add(new Employee(1, "Raj", 2000));

	}

	private static void printEmployeesList(List<Employee> employees) {

	}
}
