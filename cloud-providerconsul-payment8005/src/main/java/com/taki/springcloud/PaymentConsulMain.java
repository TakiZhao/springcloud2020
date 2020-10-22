package com.taki.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Create by zhaoming at 2020-03-14 21:38
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsulMain {

    public static void main(String[] args) {
        SpringApplication.run(PaymentConsulMain.class, args);
    }

}
