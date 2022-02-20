package com.example.springwrongdemo.service;

import com.example.springwrongdemo.config.TakeTime;
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
public class ElectricService1 {
    public void charge() throws InterruptedException {
        log.info("charging...");
        ElectricService1 electric = (ElectricService1) AopContext.currentProxy();
        electric.pay();
    }

    @TakeTime
    public void pay() throws InterruptedException {
        log.info("paying...");
        Thread.sleep(1000);
    }
}