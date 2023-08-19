package com.cbt.adminservicecbtaug23one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Adminservicecbtaug23oneApplication {

    public static void main(String[] args) {


        new SpringApplicationBuilder()
                .profiles("prod")
                .sources(Adminservicecbtaug23oneApplication.class)
                .run(args);
    }

}
