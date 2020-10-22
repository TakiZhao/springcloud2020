package com.taki.springcloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.taki.springcloud.service.IMessageProvider;
import org.springframework.cloud.commons.util.IdUtils;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Create by zhaoming at 2020-03-29 21:58
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String uuid = IdUtil.simpleUUID();
        output.send(MessageBuilder.withPayload(uuid).build());
        return uuid;
    }
}
