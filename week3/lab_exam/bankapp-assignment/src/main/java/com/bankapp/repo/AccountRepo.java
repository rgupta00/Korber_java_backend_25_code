package com.bankapp.repo;

import com.bankapp.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository <Account, Integer> {
}
