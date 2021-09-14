package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;


//@Configuration
//@ComponentScan(basePackages = {"com.example"})
//@EnableAutoConfiguration
// or
@SpringBootApplication
@EntityScan(value = {"com.example.model"})
@EnableTransactionManagement
public class Application {
    public static void main(String[] args) {

        // init / boot phase
        ConfigurableApplicationContext applicationContext=
                SpringApplication.run(Application.class,args);

        // use phase
//        TransferService transferService=applicationContext.getBean("txrService",TransferService.class);
//        transferService.transfer(1000.00, "1", "2");
//        System.out.println();
//        transferService.transfer(1000.00, "2", "1");

         // destroy phase


    }
}
