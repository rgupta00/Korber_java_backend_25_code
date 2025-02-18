package com.courseapp;

import com.courseapp.exceptions.CourseNotFoundException;
import com.courseapp.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.print.Book;
import java.util.List;

@SpringBootApplication
public class CourseappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CourseappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
