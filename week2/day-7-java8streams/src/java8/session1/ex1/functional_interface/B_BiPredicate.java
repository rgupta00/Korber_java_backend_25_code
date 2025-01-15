package java8.session1.ex1.functional_interface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class B_BiPredicate {
	public static void main(String[] args) {

		demo.java8.session1.ex1.functional_interface.Employee e1 = new demo.java8.session1.ex1.functional_interface.Employee(1, "raja", 600000);
		demo.java8.session1.ex1.functional_interface.Employee e2 = new demo.java8.session1.ex1.functional_interface.Employee(15, "raja", 500000);

		BiPredicate<demo.java8.session1.ex1.functional_interface.Employee, demo.java8.session1.ex1.functional_interface.Employee> biPredicate =
				(emp1, emp2) -> emp1.getSalary() > emp2.getSalary();

				System.out.println(biPredicate.test(e1, e2));
	}
}
