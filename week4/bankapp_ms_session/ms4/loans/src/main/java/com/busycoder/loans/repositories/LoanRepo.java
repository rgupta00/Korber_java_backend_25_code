package com.busycoder.loans.repositories;

import com.busycoder.loans.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepo extends JpaRepository<Loan, Integer> {
    public Loan findByMobile(String mobile);
}
