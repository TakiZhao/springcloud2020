package com.taki.springcloud.service;

import java.math.BigDecimal;

/**
 * Create by zhaoming at 2020-04-05 16:22
 */
public interface AccountService {

    /**
     * 减库存
     *
     * @param userId 用户id
     * @param money  金额
     * @return
     */
    void decrease(Long userId, BigDecimal money);

}
