package com.taki.springcloud.service.impl;

import com.taki.springcloud.dao.OrderDao;
import com.taki.springcloud.domain.Order;
import com.taki.springcloud.service.AccountService;
import com.taki.springcloud.service.OrderService;
import com.taki.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Create by zhaoming at 2020-04-05 15:30
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    @GlobalTransactional(name = "fsp-create-order", rollbackFor = Exception.class)
    @Override
    public void create(Order order) {
        log.info("------开始新建订单-----");
        orderDao.create(order);

        log.info("订单微服务开始调用库存，做扣减开始...");
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("订单微服务开始调用库存，做扣减结束...");

        log.info("账户余额开始做扣减开始...");
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("账户余额开始做扣减结束...");

        log.info("修改订单状态开始...");
        orderDao.update(order.getUserId(), 0);
        log.info("修改订单状态结束...");

        log.info("下订单结束了...");
    }
}
