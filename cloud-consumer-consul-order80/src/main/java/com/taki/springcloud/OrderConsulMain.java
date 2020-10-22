package com.taki.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Create by zhaoming at 2020-03-14 21:57
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain {

    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain.class, args);
    }

}
