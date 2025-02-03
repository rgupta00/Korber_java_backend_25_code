package com.busycoder.cards.uti;

import com.busycoder.cards.dto.CardDto;
import com.busycoder.cards.entities.Card;

public class DtoConverter {

    public static  CardDto entityToDto(Card card){
        CardDto cardDto = new CardDto();
        cardDto.setCardId(card.getCardId());
        cardDto.setCardNumber(card.getCardNumber());
        cardDto.setIssueDate(card.getIssueDate());
        cardDto.setTotalLimit(card.getTotalLimit());
        cardDto.setMobile(card.getMobile());
        return cardDto;

    }

    public static  Card dtoToEntity(CardDto cardDto){
        Card card = new Card();
        card.setCardId(cardDto.getCardId());
        card.setCardNumber(cardDto.getCardNumber());
        card.setIssueDate(cardDto.getIssueDate());
        card.setTotalLimit(cardDto.getTotalLimit());
        card.setMobile(cardDto.getMobile());
        return card;


    }
}
