package com.example.springwrongdemo.service;

import com.example.springwrongdemo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author chrisxu
 * @create 2022-01-16 22:27
 * Ctrl + Alt + L：格式化代码
 * ctrl + Alt + T：代码块包围
 * ctrl + Y：删除行
 * ctrl + D：复制行
 * alt+上/下：移动光标到上/下方法
 * ctrl+shift+/：注释多行
 */
@Service
@Slf4j
public class AdminUserService1 {
    public User getUser() {
        return new User("20220116");
    }
    public void login() {
        log.info("login...");
    }
}
