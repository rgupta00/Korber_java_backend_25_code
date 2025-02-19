package com.bookapp.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@NoArgsConstructor
@Document(collection = "journal_entries")
@Data

public class JournalEntry {
    @Id
    private String id;

    private String title;
    private String content;
    private LocalDateTime date;

    public JournalEntry(String title, String content, LocalDateTime date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }
}
