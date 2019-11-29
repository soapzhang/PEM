package com.fpi.pem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PemWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PemWebApplication.class, args);
    }

}
