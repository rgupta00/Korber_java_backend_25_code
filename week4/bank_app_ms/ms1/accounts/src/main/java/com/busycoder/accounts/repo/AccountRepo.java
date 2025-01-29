package com.busycoder.accounts.repo;

import com.busycoder.accounts.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account, Integer> {
    public Account findByMobile(String mobile);
}
