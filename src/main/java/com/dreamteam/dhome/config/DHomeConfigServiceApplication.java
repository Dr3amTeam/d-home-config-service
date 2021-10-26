package com.dreamteam.dhome.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DHomeConfigServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DHomeConfigServiceApplication.class, args);
    }

}
