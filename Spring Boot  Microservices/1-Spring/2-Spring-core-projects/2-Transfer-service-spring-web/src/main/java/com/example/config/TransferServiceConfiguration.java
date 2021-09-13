package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@ComponentScan(basePackages = {"com.example.config","com.example.repository","com.example.service","com.example.web"})
@EnableTransactionManagement
public class TransferServiceConfiguration {

}
