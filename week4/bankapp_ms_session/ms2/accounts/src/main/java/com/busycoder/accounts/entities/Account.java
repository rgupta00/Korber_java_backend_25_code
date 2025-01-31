package com.busycoder.accounts.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@Entity
@Table(name = "account_table")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accId;
    private String name;
    private double balance;
    private String email;
    private String mobile;

    public Account(String name, double balance, String email, String mobile) {
        this.name = name;
        this.balance = balance;
        this.email = email;
        this.mobile = mobile;
    }
}