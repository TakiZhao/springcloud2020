package com.taki.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * Create by zhaoming at 2020-03-15 15:54
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstanceList);

}
