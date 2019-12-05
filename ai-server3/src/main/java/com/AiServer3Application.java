package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AiServer3Application {

    public static void main(String[] args) {
        SpringApplication.run(AiServer3Application.class, args);
    }

}
