package com.taki.springcloud.controller;

import com.taki.springcloud.domain.CommonResult;
import com.taki.springcloud.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * Create by zhaoming at 2020-04-05 16:25
 */
@RestController
public class AccountController {

    @Resource
    private AccountService accountService;

    @PostMapping(value = "account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money) {
        accountService.decrease(userId, money);
        return new CommonResult(200, "扣减账户余额成功");
    }

}
