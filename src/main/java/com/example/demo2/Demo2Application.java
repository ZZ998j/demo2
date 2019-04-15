package com.example.demo2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {
    protected static final Logger logger = LoggerFactory.getLogger(Demo2Application.class);
    public static void main(String[] args) {

        logger.info("fff3");
        SpringApplication.run(Demo2Application.class, args);
        logger.info("fff4");
    }

}
