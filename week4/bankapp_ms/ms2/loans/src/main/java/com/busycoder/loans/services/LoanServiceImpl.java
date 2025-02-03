package com.busycoder.loans.services;

import com.busycoder.loans.dto.LoanDto;
import com.busycoder.loans.entities.Loan;
import com.busycoder.loans.repositories.LoanRepo;
import com.busycoder.loans.util.DtoConverter;
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
