package com.example.springwrongdemo.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

/**
 * @author chrisxu
 * @create 2022-01-16 21:44
 * Ctrl + Alt + L：格式化代码
 * ctrl + Alt + T：代码块包围
 * ctrl + Y：删除行
 * ctrl + D：复制行
 * alt+上/下：移动光标到上/下方法
 * ctrl+shift+/：注释多行
 */
@Aspect
@Service
@Slf4j
public class AopConfig {
    @Around("execution(* com.example.springwrongdemo.service.ElectricService.pay())")
    public void recordPayPerformance(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        joinPoint.proceed();
        long end = System.currentTimeMillis();
        log.info("pay method time cost(ms):" + (end - start));
    }

    @Around("execution(* com.example.springwrongdemo.service.AdminUserService.login())")
    public void logLogin(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("log admin login...");
    }
}
