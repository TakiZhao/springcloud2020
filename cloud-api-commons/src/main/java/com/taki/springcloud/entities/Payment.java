package com.taki.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 订单类
 * Create by zhaoming at 2020-03-08 21:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 流水号
     */
    private String serial;

}
