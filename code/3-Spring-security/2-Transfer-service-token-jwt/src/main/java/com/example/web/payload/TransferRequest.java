package com.example.web.payload;

import lombok.Data;

@Data
public class TransferRequest {

    private double amount;
    private String fromAccNum;
    private String toAccNum;

}
