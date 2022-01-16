package com.example.springwrongdemo.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author chrisxu
 * @create 2022-01-16 21:27
 * Ctrl + Alt + L：格式化代码
 * ctrl + Alt + T：代码块包围
 * ctrl + Y：删除行
 * ctrl + D：复制行
 * alt+上/下：移动光标到上/下方法
 * ctrl+shift+/：注释多行
 */
public class LightMgrService {
    @Autowired
    private LightService lightService;

    /**
     * 使用Autowired标记的装配行为，发生在构造器方法执行之后
     * 因此会空指针异常
     * 解决：
     * 1.使用构造器隐式注入
     * 2.postConstruct注解
     * 3.实现initialzingBean接口
     */
    public LightMgrService() {
        lightService.check();
    }
}
