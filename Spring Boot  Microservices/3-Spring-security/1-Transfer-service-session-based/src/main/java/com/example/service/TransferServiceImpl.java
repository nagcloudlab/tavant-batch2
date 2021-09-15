package com.example.service;


import com.example.model.Account;
import com.example.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "txrService")
@Slf4j
public class TransferServiceImpl implements  TransferService{

    private AccountRepository accountRepository;

    public TransferServiceImpl(AccountRepository accountRepository) {
        this.accountRepository=accountRepository;
        log.info("TransferServiceImpl instance created...");
    }

    @Transactional
    public void transfer(double amount, String fromAccNum, String toAccNum) {

        log.info("transfer initiated.");

        log.info(fromAccNum,toAccNum);

        Account fromAccount = accountRepository.load(fromAccNum);
        Account toAccount = accountRepository.load(toAccNum);

        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);

        accountRepository.update(fromAccount);
        accountRepository.update(toAccount);

        log.info("transfer finished.");

    }

}