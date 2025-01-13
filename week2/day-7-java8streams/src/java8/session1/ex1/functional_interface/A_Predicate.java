package demo.java8.session1.ex1.functional_interface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class A_Predicate {
    public static void main(String[] args) {

       //What is predicate? data -> true/false
    	//Predicate : No--> even/odd
    	Predicate<Integer>predicateEven= no -> no%2==0;
    	System.out.println(predicateEven.test(33));
		
    	Predicate<String>p2=name-> name.contains("raj");
    	System.out.println(p2.test("rajesh"));
		
    	//filter operation?
    	//if emp salary >500000 : rich poor
    	Predicate<Employee> p3= e-> e.getSalary()>=500000;
    	Employee e1=new Employee(1, "raja", 600000);
    	System.out.println(p3.test(e1));
		
    	
		
		
		
    }
}
