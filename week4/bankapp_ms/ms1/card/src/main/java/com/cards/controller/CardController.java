package com.cards.controller;

import com.cards.dto.CardDto;
import com.cards.dto.InfoDto;
import com.cards.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api")
public class CardController {

    private CardService cardService;

    @Autowired
    private InfoDto infoDto;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    //get by mobile
    @GetMapping(path = "fetch")
    public CardDto findByMobileNumber(@RequestParam(name="mobile") String mobile){
        return cardService.getCardByMobile(mobile);
    }

    @GetMapping(path = "contact-info")
    public InfoDto getInfo(){
        return  infoDto;
    }
}
