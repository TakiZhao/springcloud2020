package com.taki.springcloud.service;

import com.taki.springcloud.entities.Payment;

/**
 * Create by zhaoming at 2020-03-08 22:10
 */
public interface PaymentService {

    /**
     * 新增
     *
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 根据Id查询
     *
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);

}
