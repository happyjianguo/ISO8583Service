package com.swiftpass.isoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.swiftpass.isoservice.iso8583.*")
public class Iso8583Application {

    public static void main(String[] args) {
        SpringApplication.run(Iso8583Application.class, args);
    }

}
