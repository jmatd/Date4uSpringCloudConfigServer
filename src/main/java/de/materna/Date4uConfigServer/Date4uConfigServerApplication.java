package de.materna.Date4uConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Date4uConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Date4uConfigServerApplication.class, args);
    }
}

