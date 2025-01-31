package com.cards.util;

import com.cards.dto.CardDto;
import com.cards.entites.Card;

public class ConvertDto {

    public static CardDto toDto(Card card) {
        CardDto cardDto = new CardDto();
        cardDto.setCardId(card.getCardId());
        cardDto.setCardNumber(card.getCardNumber());
        cardDto.setIssueDate(card.getIssueDate());
        cardDto.setTotalLimit(card.getTotalLimit());
        cardDto.setMobile(card.getMobile());
        return cardDto;
    }
    public static Card toEntity(CardDto cardDto) {
        Card card = new Card();
        card.setCardId(cardDto.getCardId());
        card.setCardNumber(cardDto.getCardNumber());
        card.setIssueDate(cardDto.getIssueDate());
        card.setTotalLimit(cardDto.getTotalLimit());
        card.setMobile(cardDto.getMobile());
        return card;
    }
}
