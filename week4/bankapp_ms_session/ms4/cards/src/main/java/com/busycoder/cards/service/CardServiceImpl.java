package com.busycoder.cards.service;

import com.busycoder.cards.dto.CardDto;
import com.busycoder.cards.entities.Card;
import com.busycoder.cards.repo.CardRepo;
import com.busycoder.cards.uti.DtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CardServiceImpl implements CardService{
    @Autowired
    private CardRepo cardRepo;
    @Override
    public CardDto findByMobileNumber(String mobile) {
        Card card= cardRepo.findByMobile(mobile);
        return DtoConverter.entityToDto(card);
    }
}
