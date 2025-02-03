package com.accounts.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
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
