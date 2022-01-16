package com.example.springwrongdemo.entity;

import lombok.Data;

/**
 * @author chrisxu
 * @create 2022-01-16 22:16
 * Ctrl + Alt + L：格式化代码
 * ctrl + Alt + T：代码块包围
 * ctrl + Y：删除行
 * ctrl + D：复制行
 * alt+上/下：移动光标到上/下方法
 * ctrl+shift+/：注释多行
 */
@Data
public class User {
    private String payNum;

    public User(String payNum) {
        this.payNum = payNum;
    }
}
