package com.example.springwrongdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

/**
 * @author chrisxu
 * @create 2022-01-16 21:54
 * Ctrl + Alt + L：格式化代码
 * ctrl + Alt + T：代码块包围
 * ctrl + Y：删除行
 * ctrl + D：复制行
 * alt+上/下：移动光标到上/下方法
 * ctrl+shift+/：注释多行
 */
@Service
@Slf4j
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class ElectricService1 {
    /**
     * todo
     * Cannot find current proxy: Set 'exposeProxy' property on Advised to 'true' to make it available,
     * and ensure that AopContext.currentProxy() is invoked in the same thread as the AOP invocation
     *
     * @throws InterruptedException
     */
    public void charge() throws InterruptedException {
        log.info("charging...");
        ElectricService1 electric = (ElectricService1) AopContext.currentProxy();
        electric.pay();
    }

    public void pay() throws InterruptedException {
        log.info("paying...");
        Thread.sleep(1000);
    }
}