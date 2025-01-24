package com.bankapp.dao.impl;

import com.bankapp.dao.Account;
import com.bankapp.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

@Repository(value = "jdbcAccountDao")
@Primary
public class AccountDaoImplJdbcV2 implements AccountDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public AccountDaoImplJdbcV2(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Account getById(int id) {
        return jdbcTemplate.queryForObject("select * from account where id=?",
                new AccountRowMapper(), id);
    }

    @Override
    public List<Account> getAllAccounts() {
       return jdbcTemplate.query("select * from account",new AccountRowMapper());
    }

    @Override
    public void update(Account account) {
        jdbcTemplate.update("update account set balance=? where id=?",
                new Object[]{account.getBalance(), account.getId()});
    }

    @Override
    public void delete(int id) {
        jdbcTemplate.update("delete from account where id=?", id);
    }

    @Override
    public void addAccount(Account account) {
        jdbcTemplate.update("insert into account(name,balance) values(?,?)", new Object[]{account.getName(), account.getBalance()});
    }
}
