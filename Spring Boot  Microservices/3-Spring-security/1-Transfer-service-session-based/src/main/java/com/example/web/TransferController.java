package com.example.web;

import com.example.web.payload.Status;
import com.example.web.payload.TransferRequest;
import com.example.web.payload.TransferResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.service.TransferService;

import java.security.Principal;
import java.util.Collection;

@Controller
public class TransferController {

    @Autowired
    private TransferService transferService;

    @GetMapping("/txr")
    public String txrForm(Model model){

        SecurityContext securityContext= SecurityContextHolder.getContext();
        Object object=securityContext.getAuthentication().getPrincipal();
        System.out.println(object);

        Collection<?> collection=securityContext.getAuthentication().getAuthorities();
        for(Object authority:collection){
            System.out.println(authority);
        }

        model.addAttribute("tnr","Nag");
        return "txr-form";
    }


    @PostMapping("/txr")
    public String txrForm(@ModelAttribute TransferRequest request,Model model){

//        SecurityContext securityContext= SecurityContextHolder.getContext();
//        Object object=securityContext.getAuthentication().getPrincipal();
//        System.out.println(object);
//
//        Collection<?> collection=securityContext.getAuthentication().getAuthorities();
//        for(Object authority:collection){
//            System.out.println(authority);
//        }


        transferService.transfer(request.getAmount(), request.getFromAccNum(), request.getToAccNum());
        TransferResponse response = new TransferResponse();
        response.setStatus(Status.SUCCESS);
        model.addAttribute("txrResponse",response);
        return "txr-status";
    }


    @PostMapping(value = "/api/txr")
    public TransferResponse doTransfer(@RequestBody TransferRequest request) {
        transferService.transfer(request.getAmount(), request.getFromAccNum(), request.getToAccNum());
        TransferResponse response = new TransferResponse();
        response.setStatus(Status.SUCCESS);
        return response;
    }

}
