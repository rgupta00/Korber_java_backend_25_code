package com.busycoder.loans.util;

import com.busycoder.loans.dto.LoanDto;
import com.busycoder.loans.entities.Loan;

public class DtoConverter {
    public static Loan dtoToEntity(LoanDto loanDto){
        Loan loan = new Loan();
        loan.setLoanId(loanDto.getLoanId());
        loan.setMobile(loanDto.getMobile());
        loan.setLoanNumber(loanDto.getLoanNumber());
        loan.setLoanType(loanDto.getLoanType());
        loan.setTotalLoan(loanDto.getTotalLoan());
        loan.setAmountPaid(loanDto.getAmountPaid());
        loan.setOutstandingAmount(loanDto.getOutstandingAmount());
        return loan;
    }

    public  static  LoanDto entityToDto(Loan loan){
        LoanDto loanDto = new LoanDto();
        loanDto.setLoanId(loan.getLoanId());
        loanDto.setMobile(loan.getMobile());
        loanDto.setLoanNumber(loan.getLoanNumber());
        loanDto.setLoanType(loan.getLoanType());
        loanDto.setTotalLoan(loan.getTotalLoan());
        loanDto.setAmountPaid(loan.getAmountPaid());
        loanDto.setOutstandingAmount(loan.getOutstandingAmount());
        return loanDto;
    }
}
