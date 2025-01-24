package com.bankapp.web;

import com.bankapp.config.AppConfig;
import com.bankapp.dao.Account;
import com.bankapp.exceptions.BEx;
import com.bankapp.service.AccountService;
import com.bankapp.service.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx=
                new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService accountService= ctx.getBean("as", AccountService.class);



//         Account account=new Account("amit",1000.00);
//         accountService.addAccount(account);

        List<Account> getAllAccounts = accountService.getAllAccounts();
        getAllAccounts.forEach(System.out::println);
//
       try{
           accountService.transfer(1,2,10);
           System.out.println("after transfer");
           getAllAccounts = accountService.getAllAccounts();
           getAllAccounts.forEach(System.out::println);
       }catch (BEx e){
           System.out.println(e.getMessage());
       }


    }
}
