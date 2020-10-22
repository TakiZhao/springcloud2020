package com.taki.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Create by zhaoming at 2020-03-15 16:48
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain.class, args);
    }

}
