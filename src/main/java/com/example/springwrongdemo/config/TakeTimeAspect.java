//package com.example.springwrongdemo.config;
//
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
///**
// * @author chrisxu
// * @create 2022-02-20 16:52
// * Ctrl + Alt + L：格式化代码
// * ctrl + Alt + T：代码块包围
// * ctrl + Y：删除行
// * ctrl + D：复制行
// * alt+上/下：移动光标到上/下方法
// * ctrl+shift+/：注释多行
// */
//@Aspect
//@Slf4j
//@Component
//public class TakeTimeAspect {
//
//    /**
//     * 统计请求的处理时间
//     */
//    ThreadLocal<Long> startTime = new ThreadLocal<>();
//
//    /**
//     * 带有@TakeTime注解的方法
//     */
//    @Pointcut("@annotation(TakeTime)")
//    public void log() {
//
//    }
//
//    @Before("log()")
//    public void doBefore(JoinPoint joinPoint) throws Throwable {
//        startTime.set(System.currentTimeMillis());
//        log.info("doBefore" );
//    }
//
//    @AfterReturning(returning = "ret", pointcut = "log()")
//    public void doAfterReturning(Object ret) {
//        //处理完请求后，返回内容
//        log.info("method time cost(ms):" + (System.currentTimeMillis() - startTime.get()));
//    }
//
//
//}
