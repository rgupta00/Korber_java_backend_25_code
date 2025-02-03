package com.bankapp.service;

import com.bankapp.dto.AccountDto;
import com.bankapp.dto.DepositDto;
import com.bankapp.dto.TransferDto;
import com.bankapp.dto.WithdrawDto;
import com.bankapp.entities.Account;
import com.bankapp.exceptions.BankAccountNotFoundException;
import com.bankapp.exceptions.NotSufficientFundException;
import com.bankapp.repo.AccountRepo;
import com.bankapp.util.ConvertUtil;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
@Service
@Transactional //ACID
@AllArgsConstructor
public class AccountServiceImpl implements AccountService{

    private final AccountRepo accountRepo;

    private final  Environment environment;



    @Override
    public List<AccountDto> getAllAccounts() {
        return accountRepo.findAll()
                .stream()
                .map(ConvertUtil::convertToAccountDto).toList();
    }

    @Override
    public AccountDto getAccount(int id) {
        return accountRepo
                .findById(id)
                .map(ConvertUtil::convertToAccountDto)
                .orElseThrow(()-> new BankAccountNotFoundException("account with id "+ id + " not found"));
    }

    @Override
    public String transfer(TransferDto transferDto) {
        //get both the accounts.
        Account fromAcc=ConvertUtil.convertToAccount(getAccount(transferDto.getFromAccountId()));

        Account toAcc=ConvertUtil.convertToAccount(getAccount(transferDto.getToAccountId()));

        fromAcc.setBalance(fromAcc.getBalance().subtract(transferDto.getAmount()));
        BigDecimal value=fromAcc.getBalance();

        if(value.compareTo(BigDecimal.ZERO)<0){
            throw new NotSufficientFundException("insufficient balance");
        }

        toAcc.setBalance(toAcc.getBalance().add(transferDto.getAmount()));

        accountRepo.save(fromAcc);


        accountRepo.save(toAcc);

        return environment.getProperty("transfer.message.success");
    }

    @Override
    public String deposit(DepositDto depositDto) {
        Account acc=ConvertUtil.convertToAccount(getAccount(depositDto.getAccountId()));
        acc.setBalance(acc.getBalance().add(depositDto.getAmount()));
        accountRepo.save(acc);
        return "deposit done successfully";
    }

    //2000 5000
    @Override
    public String withdraw(WithdrawDto withdrawDto) {
        Account temp=ConvertUtil.convertToAccount(getAccount(withdrawDto.getAccountId()));
        temp.setBalance(temp.getBalance().subtract(withdrawDto.getAmount()));
        BigDecimal tempBalance=temp.getBalance();

        if(tempBalance.compareTo(BigDecimal.ZERO)<0){
            throw new NotSufficientFundException("insufficient balance");
        }

        accountRepo.save(temp);
        return "withdraw done successfully";
    }
}
