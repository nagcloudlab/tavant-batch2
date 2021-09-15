package com.example.web;

import com.example.web.payload.Status;
import com.example.web.payload.TransferRequest;
import com.example.web.payload.TransferResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.TransferService;

@RestController
public class TransferController {

    @Autowired
    private TransferService transferService;

    @PostMapping(value = "/api/txr")
    public TransferResponse doTransfer(@RequestBody TransferRequest request) {
        transferService.transfer(request.getAmount(), request.getFromAccNum(), request.getToAccNum());
        TransferResponse response = new TransferResponse();
        response.setStatus(Status.SUCCESS);
        return response;
    }

}
