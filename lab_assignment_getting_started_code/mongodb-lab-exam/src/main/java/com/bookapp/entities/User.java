package com.bookapp.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;


public class User {

  
    private String id;

  
    private String userName;
    private String email;

   
    private List<JournalEntry> journalEntries = new ArrayList<>();

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }
}