package com.cards.repo;

import com.cards.entites.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepo extends JpaRepository<Card, Integer> {
    public Card findByMobile(String cardNumber);
}
