package com.example.repository;


import com.example.model.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
@Slf4j
public class JdbcAccountRepository implements  AccountRepository{

    private DataSource dataSource;

    public JdbcAccountRepository(DataSource dataSource) {
        this.dataSource=dataSource;
        log.info("JdbcAccountRepository instance created...");
    }

    public Account load(String number) {
        log.info("loading account " + number);
        return new Account(number, 1000.00);
    }

    public void update(Account account) {
        log.info("updating account " + account.getNumber());
    }

}