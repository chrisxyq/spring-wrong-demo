package com.example.springwrongdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chrisxu
 * @create 2022-01-16 22:14
 * Ctrl + Alt + L：格式化代码
 * ctrl + Alt + T：代码块包围
 * ctrl + Y：删除行
 * ctrl + D：复制行
 * alt+上/下：移动光标到上/下方法
 * ctrl+shift+/：注释多行
 */
@Service
@Slf4j
public class ElectricService2 {
    @Autowired
    AdminUserService adminUserService;

    /**
     * 切面日志将不会生效
     *
     * @throws InterruptedException
     */
    public void charge() throws InterruptedException {
        log.info("charging...");
        this.pay();
    }

    public void pay() throws InterruptedException {
        adminUserService.login();
        String payNum = adminUserService.adminUser.getPayNum();
        log.info("payNum:" + payNum);
        log.info("paying...");
        Thread.sleep(1000);
    }
}
