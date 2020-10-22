package com.taki.springcloud.service;

/**
 * Create by zhaoming at 2020-04-05 16:07
 */
public interface StorageService {

    /**
     * 减库存
     *
     * @param productId
     * @param count
     * @return
     */
    void decrease(Long productId, Integer count);

}
