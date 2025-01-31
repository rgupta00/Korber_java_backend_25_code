package com.busycoder.loans.controller;

import com.busycoder.loans.dto.InfoDto;
import com.busycoder.loans.dto.LoanDto;
import com.busycoder.loans.services.LoanService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "api")
@RestController
@AllArgsConstructor
public class LoanController {
    private final LoanService loanService;
    private final InfoDto infoDto;

    @GetMapping("fetch")
    public LoanDto getByMobile( @RequestParam(name="mobile") String mobile){
        return loanService.findByMobile(mobile);
    }
    @GetMapping("contact-info")
    public InfoDto getInfoDto(){
        return infoDto;
    }


}
