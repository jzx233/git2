package com.example.ssmspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SsmspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmspringbootApplication.class, args);
    }

}
