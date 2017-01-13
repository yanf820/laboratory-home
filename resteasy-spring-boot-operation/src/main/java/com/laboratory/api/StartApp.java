package com.laboratory.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by yf on 2017/1/13.
 */

@SpringBootApplication
@ComponentScan(basePackages = "com.laboratory.*")
public class StartApp extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(StartApp.class,args);
    }
}
