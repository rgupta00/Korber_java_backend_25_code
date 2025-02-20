package com.bookapp.repo;

import com.bookapp.entities.JournalEntry;
import com.bookapp.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User, String> {
}
