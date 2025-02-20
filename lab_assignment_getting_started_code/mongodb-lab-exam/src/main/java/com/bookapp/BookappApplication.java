package com.bookapp;

import com.bookapp.entities.JournalEntry;
import com.bookapp.entities.User;
import com.bookapp.exceptions.ResourceNotFoundException;
import com.bookapp.repo.JournalEntryRepo;
import com.bookapp.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.print.Book;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class BookappApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(BookappApplication.class, args);
	}

}
