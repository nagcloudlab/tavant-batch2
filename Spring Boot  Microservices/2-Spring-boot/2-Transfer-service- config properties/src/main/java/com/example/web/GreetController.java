package com.example.web;

import com.example.config.GreetingProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class GreetController {

    @Value("${greet.message: hello}")
    String message;

    @Value("hello")
    private String staticMessage;

    @Value("${greet.messages}")
    private List<String> messages;

    @Value("#{${greet.locale.messages}}")
    private Map<String,String> dbValues;

    @Autowired
    GreetingProperties greetingProperties;

    @Autowired
    Environment environment;

    @GetMapping("/api/greet")
    public String greet(){
        return message;
    }

}
