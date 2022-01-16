package com.example.springwrongdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @author chrisxu
 * @create 2022-01-16 16:47
 * Ctrl + Alt + L：格式化代码
 * ctrl + Alt + T：代码块包围
 * ctrl + Y：删除行
 * ctrl + D：复制行
 * alt+上/下：移动光标到上/下方法
 * ctrl+shift+/：注释多行
 */
@Service
public class ServiceImpl1 {
    private String serviceName;

    /**
     * 解决：新增JavaConfig
     * @param serviceName
     */
    public ServiceImpl1(String serviceName) {
        this.serviceName = serviceName;
    }


}
