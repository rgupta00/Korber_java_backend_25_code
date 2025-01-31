package com.busycoder.cards.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardId;
    private String cardNumber;
    private LocalDate issueDate;
    private int totalLimit;
    private String mobile;

    public Card(String cardNumber, LocalDate issueDate, int totalLimit, String mobile) {
        this.cardNumber = cardNumber;
        this.issueDate = issueDate;
        this.totalLimit = totalLimit;
        this.mobile = mobile;
    }
}