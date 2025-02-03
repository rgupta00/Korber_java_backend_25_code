package com.bankapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
//Entity : intract with db JPA @Entity @Table

// dto: used to take data from ui pass in 3 layer arch
//SRP

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "account_id")
    private int id;

    @Column(name = "account_holder_name", nullable = false)
    private String name;

    @Column(name = "account_balance", nullable = false)
    private BigDecimal balance;

    public Account(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }
}
