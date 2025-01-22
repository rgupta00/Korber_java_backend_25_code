package com.bankapp.web;

import com.bankapp.config.AppConfig;
import com.bankapp.dao.Account;
import com.bankapp.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx=
                new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService accountService= ctx.getBean("as", AccountService.class);
        System.out.println("before transfer");
        List<Account> getAllAccounts = accountService.getAllAccounts();
        getAllAccounts.forEach(System.out::println);

        accountService.transfer(1,2,10);
        System.out.println("after transfer");
        getAllAccounts = accountService.getAllAccounts();
        getAllAccounts.forEach(System.out::println);

    }
}
