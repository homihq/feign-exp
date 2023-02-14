package com.homihq.feignexp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeignExpApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignExpApplication.class, args);
    }

}
