package com.loans.services;

import com.loans.dto.LoanDto;

public interface LoanService {
    public LoanDto findByMobile(String mobile);
}
