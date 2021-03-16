package com.example.testcx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement

@MapperScan("com.example.testcx.mapper")
public class TestcxApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestcxApplication.class, args);
    }

}
