package com.example.springwrongdemo.controller;

import com.example.springwrongdemo.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chrisxu
 * @create 2022-01-16 20:57
 * Ctrl + Alt + L：格式化代码
 * ctrl + Alt + T：代码块包围
 * ctrl + Y：删除行
 * ctrl + D：复制行
 * alt+上/下：移动光标到上/下方法
 * ctrl+shift+/：注释多行
 */
@RestController
@Slf4j
public class ValueTestController {
    @Value("#{student}")
    private Student student;
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;

    @RequestMapping(path = "user")
    public String getUser() {
        return username + ":" + password + ":" + student;
    }
}
