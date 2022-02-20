package com.example.springwrongdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 13692
 */
@SpringBootApplication
@ComponentScans(value = {
        @ComponentScan(value = "com.example.springwrongdemo.controller"),
        @ComponentScan(value = "com.example.springwrongdemo.service"),
        @ComponentScan(value = "com.example.springwrongdemo.config")
})
@EnableAspectJAutoProxy(exposeProxy = true)
public class SpringWrongDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWrongDemoApplication.class, args);
    }

}
