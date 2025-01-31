package com.loans.controller;

import com.loans.dto.InfoDto;
import com.loans.dto.LoanDto;
import com.loans.services.LoanService;
import lombok.AllArgsConstructor;
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
