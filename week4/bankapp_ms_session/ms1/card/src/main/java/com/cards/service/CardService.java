package com.cards.service;

import com.cards.dto.CardDto;

import java.util.List;

public interface CardService {
    public List<CardDto> getAllCards();
    public CardDto getCardByMobile(String mobile);
}
