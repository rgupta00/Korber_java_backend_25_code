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
public class BookappApplication implements CommandLineRunner {

	@Autowired
	private JournalEntryRepo journalEntryRepo;

	@Autowired
	private UserRepo userRepo;


	public static void main(String[] args) {
		SpringApplication.run(BookappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		JournalEntry journalEntry = new JournalEntry("life with tech", "it is is good but u need to be always learning",
				LocalDateTime.now());
		JournalEntry journalEntry2 = new JournalEntry("family", "depends how you serve them", LocalDateTime.now());
		JournalEntry journalEntry3 = new JournalEntry("weather", "dont ask", LocalDateTime.now());

		User user=new User("raj","raj@gmail.com");
		user.getJournalEntries().add(journalEntry);
		user.getJournalEntries().add(journalEntry2);
		user.getJournalEntries().add(journalEntry3);


		journalEntryRepo.save(journalEntry);
		journalEntryRepo.save(journalEntry2);
		journalEntryRepo.save(journalEntry3);

		userRepo.save(user);

	}
}
