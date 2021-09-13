package com.example.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.example")
public class TransferServiceConfiguration {

    @Bean
    public DataSource dataSource(){
       BasicDataSource dataSource=new BasicDataSource();
       return  dataSource;
    }

}
