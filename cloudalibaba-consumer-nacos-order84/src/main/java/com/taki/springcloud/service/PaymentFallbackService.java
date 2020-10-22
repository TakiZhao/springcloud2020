package com.taki.springcloud.service;

import com.taki.springcloud.entities.CommonResult;
import com.taki.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * Create by zhaoming at 2020-04-04 13:46
 */
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "fallback");
    }
}
