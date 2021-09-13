package com.example;

import com.example.service.TransferServiceImpl;

public class Application {
    public static void main(String[] args) {

        // init / boot phase
        TransferServiceImpl transferService = new TransferServiceImpl();

        // use phase
        transferService.transfer(1000.00, "1", "2");
        System.out.println();
        transferService.transfer(1000.00, "2", "1");


        // destroy phase
        transferService = null;


    }
}
