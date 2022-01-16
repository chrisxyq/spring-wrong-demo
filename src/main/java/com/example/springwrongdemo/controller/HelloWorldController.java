package com.example.springwrongdemo.controller;

import com.example.springwrongdemo.service.DataService;
import com.example.springwrongdemo.service.ServiceImpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chrisxu
 * @create 2022-01-16 16:33
 * Ctrl + Alt + L：格式化代码
 * ctrl + Alt + T：代码块包围
 * ctrl + Y：删除行
 * ctrl + D：复制行
 * alt+上/下：移动光标到上/下方法
 * ctrl+shift+/：注释多行
 */
@RestController
public class HelloWorldController {
    @Autowired
    private ServiceImpl2 serviceImpl2;
    @Autowired
    private ApplicationContext applicationContext;


    public ServiceImpl2 getServiceImpl2() {
        return applicationContext.getBean(ServiceImpl2.class);
    }

    /**
     * 解决
     *
     * @return
     */
    @RequestMapping(path = "hiProtoType")
    public String hiProtoType() {
        return "hello world,service is :" + getServiceImpl2();
    }

    /**
     * 当一个单例的bean，使用autowired注解标记其属性，该属性值会被固定
     *
     * @return
     */
    @RequestMapping(path = "hi")
    public String hi() {
        return "hello world,service is :" + serviceImpl2;
    }
}
