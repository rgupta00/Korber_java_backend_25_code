package com.busycoder.cards.repo;

import com.busycoder.cards.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepo extends JpaRepository<Card,Integer> {
    Card findByMobile(String mobile);
}