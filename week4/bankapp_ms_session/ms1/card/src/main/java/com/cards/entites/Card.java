package com.cards.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "card_table")
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
