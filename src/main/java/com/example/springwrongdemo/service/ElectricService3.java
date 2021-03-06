package com.example.springwrongdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chrisxu
 * @create 2022-01-16 22:29
 * Ctrl + Alt + L：格式化代码
 * ctrl + Alt + T：代码块包围
 * ctrl + Y：删除行
 * ctrl + D：复制行
 * alt+上/下：移动光标到上/下方法
 * ctrl+shift+/：注释多行
 */
@Service
@Slf4j
public class ElectricService3 {
    @Autowired
    AdminUserService1 adminUserService1;

    public void charge() throws InterruptedException {
        log.info("charging...");
        this.pay();
    }

    /**
     * adminUserService1的login方法被拦截，
     * adminUserService1为被代理类，因此user属性不可直接获取，否则会NPE
     * @throws InterruptedException
     */
    public void pay() throws InterruptedException {
        adminUserService1.login();
        String payNum = adminUserService1.getUser().getPayNum();
        log.info("payNum:" + payNum);
        log.info("paying...");
        Thread.sleep(1000);
    }
}
