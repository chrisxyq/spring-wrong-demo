package com.example.springwrongdemo.controller;

import com.example.springwrongdemo.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    /**
     * #{}
     * 注入其他bean集合、bean或者bean的属性
     */
    @Value("#{student}")
    private Student student;
    @Value("#{student.id}")
    private int studentId;
    @Value("#{students}")
    private List<Student> students;
    /**
     * 直接赋值为myServiceName
     */
    @Value("#{myServiceName}")
    private String serviceName1;
    /**
     * 直接赋值为myServiceName
     */
    @Value("myServiceName")
    private String serviceName2;
    /**
     * ${}
     * 注入系统参数，环境变量或配置文件的值
     */
    @Value("${server.port}")
    private String serverPort;
    @Value("${username}")
    private String username;
    @Value("${password}")
    private String password;

    @Override
    public String toString() {
        return "ValueTestController{" +
                "student=" + student +
                ", studentId=" + studentId +
                ", students=" + students +
                ", serviceName1='" + serviceName1 + '\'' +
                ", serviceName2='" + serviceName2 + '\'' +
                ", serverPort='" + serverPort + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @RequestMapping(path = "user")
    public String getUser() {
        return this.toString();
    }
}
