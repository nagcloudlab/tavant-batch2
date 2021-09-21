package com.example.auto.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConditionalOnClass(name = "com.example.service.TavantService")
//@ConditionalOnMissingClass(value = "com.example.service.TavantService")
//@ConditionalOnBean(name = "txrService")
//@ConditionalOnProperty(name = "tavant",prefix = "training")
public class TavantAutoConfiguration {

    @Bean
    public String bean(){
        return "TAVANT-BEAN";
    }

}
