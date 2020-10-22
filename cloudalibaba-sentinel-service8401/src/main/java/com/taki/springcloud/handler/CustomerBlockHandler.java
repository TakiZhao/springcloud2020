package com.taki.springcloud.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.taki.springcloud.entities.CommonResult;

/**
 * Create by zhaoming at 2020-04-04 12:54
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(444, "客户自定义，global handlerException---1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(444, "客户自定义，global handlerException---2");
    }

}
