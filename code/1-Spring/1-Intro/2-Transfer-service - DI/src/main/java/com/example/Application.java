package com.example;

import com.example.repository.AccountRepository;
import com.example.repository.JdbcAccountRepository;
import com.example.service.TransferServiceImpl;

public class Application {
    public static void main(String[] args) {

        // init / boot phase
        AccountRepository accountRepository=new JdbcAccountRepository();
        TransferServiceImpl transferService = new TransferServiceImpl(accountRepository);

        // use phase
        transferService.transfer(1000.00, "1", "2");
        System.out.println();
        transferService.transfer(1000.00, "2", "1");


        // destroy phase
        transferService = null;


    }
}
