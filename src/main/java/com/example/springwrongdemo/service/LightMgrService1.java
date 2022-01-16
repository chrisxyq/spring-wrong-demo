package com.example.springwrongdemo.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author chrisxu
 * @create 2022-01-16 21:31
 * Ctrl + Alt + L：格式化代码
 * ctrl + Alt + T：代码块包围
 * ctrl + Y：删除行
 * ctrl + D：复制行
 * alt+上/下：移动光标到上/下方法
 * ctrl+shift+/：注释多行
 */
@Component
public class LightMgrService1 {
    private LightService lightService;

    public LightMgrService1(LightService lightService) {
        this.lightService = lightService;
        lightService.check();
    }
}
