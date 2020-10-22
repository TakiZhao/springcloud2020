package com.taki.springcloud.service.impl;

import com.taki.springcloud.dao.StorageDao;
import com.taki.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Create by zhaoming at 2020-04-05 16:07
 */
@Slf4j
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    /**
     * 减库存
     *
     * @param productId
     * @param count
     * @return
     */
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("storage-service中扣减库存开始...");
        storageDao.decrease(productId, count);
        log.info("storage-service中扣减库存结束...");
    }

}
