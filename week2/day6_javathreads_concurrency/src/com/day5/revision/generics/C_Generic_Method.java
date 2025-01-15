package com.day5.revision.generics;

public class C_Generic_Method {

	public static void main(String[] args) {
		
		Integer a=4;
		Integer b=6;
		Integer c=-1;
		Integer val=greater(a, b, c);
		
		Employee e1=new Employee(1, "raj", 5000);
		Employee e2=new Employee(17, "ekta", 7000);
		Employee e3=new Employee(10, "sumit", 6000);
		
		Employee employee=greater(e1, e2, e3);
		
		System.out.println(val);
		System.out.println(employee);
	}
	//modify it for comparator
	 static <T extends Comparable<T>> T greater(T a, T b, T c) {
			T max=a;
			//if boolean vs int
			if(b.compareTo(a)>0) {
			   max=b;
			}
			if(c.compareTo(max)>0) {
				max=c;
			}
			
			return max;
		}

//	 static Integer greater(Integer a, Integer b, Integer c) {
//		Integer max=a;
//		//if boolean vs int
//		if(b.compareTo(a)>0) {
//		   max=b;
//		}
//		if(c.compareTo(max)>0) {
//			max=c;
//		}
//		
//		return max;
//	}
}
