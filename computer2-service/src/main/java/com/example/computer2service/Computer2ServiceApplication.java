package com.example.computer2service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Computer2ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Computer2ServiceApplication.class, args);
    }

}

