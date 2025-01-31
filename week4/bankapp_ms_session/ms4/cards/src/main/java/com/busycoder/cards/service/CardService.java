package com.busycoder.cards.service;

import com.busycoder.cards.dto.CardDto;

public interface CardService {
   public CardDto findByMobileNumber(String mobile);
}