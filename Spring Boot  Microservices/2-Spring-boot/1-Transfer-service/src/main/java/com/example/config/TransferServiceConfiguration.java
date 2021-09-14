package com.example.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan(basePackages = {"com.example.web","com.example.service","com.example.repository"})
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.example.model"})
@EnableTransactionManagement
public class TransferServiceConfiguration {

}
