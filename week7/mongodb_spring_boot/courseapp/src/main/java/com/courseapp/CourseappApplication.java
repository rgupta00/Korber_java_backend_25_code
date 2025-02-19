package com.courseapp;

import com.courseapp.entities.Course;
import com.courseapp.exceptions.CourseNotFoundException;
import com.courseapp.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.aggregation.MatchOperation;

import static org.springframework.data.mongodb.core.aggregation.MatchOperation.*;


import java.util.List;

@SpringBootApplication
public class CourseappApplication implements CommandLineRunner {

	@Autowired
	private CourseRepo courseRepo;

	public static void main(String[] args) {
		SpringApplication.run(CourseappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//(String courseName, String instructor, double courseFee, String duration, boolean isCourseLive)
		Course course1 = new Course("Basic Java", "Rajeev", 2000, "4 month", true);
		Course course2 = new Course("new feature Python", "kapil", 2000, "2 month", true);
		Course course3 = new Course("Angular vs react", "Durga", 1060, "4 month", true);

		courseRepo.save(course1);
		courseRepo.save(course2);
		courseRepo.save(course3);

		List<Course> courseList = courseRepo.findByInstructorAndCourseFee("Rajeev", 3000);
		courseList.forEach(System.out::println);



	}
}
