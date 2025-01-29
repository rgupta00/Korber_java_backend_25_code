package com.busycoder.loans.services;

import com.busycoder.loans.dto.LoanDto;
import com.busycoder.loans.entities.Loan;

public interface LoanService {
    public LoanDto findByMobile(String mobile);
}
