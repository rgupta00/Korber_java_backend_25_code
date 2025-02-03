package com.loans.services;

import com.loans.dto.LoanDto;
import com.loans.repositories.LoanRepo;
import com.loans.util.DtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanServiceImpl implements LoanService{
    @Autowired
    private LoanRepo loanRepo;
    @Override
    public LoanDto findByMobile(String mobile) {
        return DtoConverter.entityToDto(loanRepo.findByMobile(mobile));
    }
}
