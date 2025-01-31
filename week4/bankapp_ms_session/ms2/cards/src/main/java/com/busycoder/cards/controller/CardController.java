package com.busycoder.cards.controller;

import com.busycoder.cards.dto.CardDto;
import com.busycoder.cards.dto.InfoDto;
import com.busycoder.cards.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping(path = "api")
@RestController
public class CardController {

    @Autowired
    private CardService cardService;
    @Autowired
    private InfoDto infoDto;

    @GetMapping(path = "fetch")
    public CardDto findByMobileNumber(@RequestParam(name="mobile") String mobile){
        return cardService.findByMobileNumber(mobile);
    }
    @GetMapping("contact-info")
    public InfoDto getInfoDto(){
        return infoDto;
    }
}
