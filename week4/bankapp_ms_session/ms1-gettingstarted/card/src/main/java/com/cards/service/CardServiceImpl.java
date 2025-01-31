package com.cards.service;

import com.cards.dto.CardDto;
import com.cards.entites.Card;
import com.cards.repo.CardRepo;
import com.cards.util.ConvertDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CardServiceImpl implements CardService{

    private CardRepo cardRepo;

    @Autowired
    public CardServiceImpl(CardRepo cardRepo) {
        this.cardRepo = cardRepo;
    }

    @Override
    public List<CardDto> getAllCards() {
        return cardRepo.findAll().stream().map(ConvertDto::toDto).toList();
    }

    @Override
    public CardDto getCardByMobile(String mobile) {
        Card card=cardRepo.findByMobile(mobile);
        return ConvertDto.toDto(card);
    }
}
