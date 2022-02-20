package com.example.springwrongdemo.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
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
@Slf4j
@Component
public class AopConfig {
    /**
     * 拦截service每个方法的写法
     */
//    @Around("execution(* com.example.springwrongdemo.service..*.*(..))")
//    @Around("execution(* com.example.springwrongdemo.service.ElectricService1.pay())")
    @Around("@annotation(TakeTime)")
    public void recordTakeTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        joinPoint.proceed();
        long end = System.currentTimeMillis();
        log.info("method time cost(ms):" + (end - start));
    }

    /**
     * 使用@Before
     * 在log.info("admin user login...")之前打印日志
     *
     * @param joinPoint
     * @throws Throwable
     */
    @Before("execution(* com.example.springwrongdemo.service.AdminUserService1.login())")
    public void logLogin(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("! admin login...");
    }
}
