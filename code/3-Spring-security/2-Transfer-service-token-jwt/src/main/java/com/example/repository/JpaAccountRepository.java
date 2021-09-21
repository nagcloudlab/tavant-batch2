package com.example.repository;


import com.example.model.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

@Repository
@Slf4j
public class JpaAccountRepository implements  AccountRepository{

    @PersistenceContext
    private EntityManager entityManager;

    public JpaAccountRepository() {
        log.info("JdbcAccountRepository instance created...");
    }

    public Account load(String number) {
        log.info("loading account " + number);
        return entityManager.find(Account.class,number);
    }

    public void update(Account account) {
        log.info("updating account " + account.getNumber());
        entityManager.merge(account);
    }

}