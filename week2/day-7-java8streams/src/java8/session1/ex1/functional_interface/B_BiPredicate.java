package demo.java8.session1.ex1.functional_interface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class B_BiPredicate {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "raja", 600000);
		Employee e2 = new Employee(15, "raja", 500000);

		BiPredicate<Employee, Employee> biPredicate = 
				(emp1, emp2) -> emp1.getSalary() > emp2.getSalary();

				System.out.println(biPredicate.test(e1, e2));
	}
}
