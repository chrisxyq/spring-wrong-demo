package com.example.springwrongdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author chrisxu
 * @create 2022-01-16 21:34
 * Ctrl + Alt + L：格式化代码
 * ctrl + Alt + T：代码块包围
 * ctrl + Y：删除行
 * ctrl + D：复制行
 * alt+上/下：移动光标到上/下方法
 * ctrl+shift+/：注释多行
 */
@Component
public class LightMgrService2 {
    @Autowired
    private LightService lightService;
    @PostConstruct
    public void init(){
        lightService.check();
    }
}
