package com.employeeapp;

import com.employeeapp.entities.Employee;
import com.employeeapp.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class EmployeeappApplication {


	public static void main(String[] args) {
		SpringApplication.run(EmployeeappApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return args -> {

//			Employee emp1 = new Employee("sunita", 4000.00);
//			Employee emp2 = new Employee("keshav", 7000.00);
//			Employee emp3 = new Employee("gunika", 3400.00);
//
//
//			Employee emp4 = new Employee("anil", 3400.00);
//			Employee emp5 = new Employee("sumit", 7900.00);
//			Employee emp6 = new Employee("umesh", 5600.00);
//
//
//
//			Employee emp7 = new Employee("vikas", 4000.00);
//			Employee emp8 = new Employee("neetu", 7000.00);
//			Employee emp9 = new Employee("kapil", 3400.00);
//
//
//			Project project1=new Project("shopping cart", "raj", LocalDate.of(2021, Month.JANUARY, 2));
//			Project project2=new Project("bank app", "ekta", LocalDate.of(2020, Month.NOVEMBER, 22));
//			Project project3=new Project("bookstore", "indu", LocalDate.of(2020, Month.DECEMBER, 12));
//
//			project1.getEmployees().add(emp1);
//			project1.getEmployees().add(emp2);
//			project1.getEmployees().add(emp3);
//
//			project2.getEmployees().add(emp4);
//			project2.getEmployees().add(emp5);
//			project2.getEmployees().add(emp6);
//
//			project3.getEmployees().add(emp7);
//			project3.getEmployees().add(emp8);
//			project3.getEmployees().add(emp9);
//
//
//			emp1.getProjects().add(project1);
//			emp2.getProjects().add(project1);
//			emp3.getProjects().add(project1);
//
//
//			emp4.getProjects().add(project2);
//			emp5.getProjects().add(project2);
//			emp6.getProjects().add(project2);
//
//			emp7.getProjects().add(project3);
//			emp8.getProjects().add(project3);
//			emp9.getProjects().add(project3);
//
//			projectRepo.save(project1);
//			projectRepo.save(project2);
//			projectRepo.save(project3);
//
//
//
//			empRepo.save(emp1);
//			empRepo.save(emp2);
//			empRepo.save(emp3);
//
//			empRepo.save(emp4);
//			empRepo.save(emp5);
//			empRepo.save(emp6);
//
//
//			empRepo.save(emp7);
//			empRepo.save(emp8);
//			empRepo.save(emp9);

		};
	}
}
