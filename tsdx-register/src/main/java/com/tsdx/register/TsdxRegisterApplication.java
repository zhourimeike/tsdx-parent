package com.tsdx.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TsdxRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(TsdxRegisterApplication.class, args);
    }

}
