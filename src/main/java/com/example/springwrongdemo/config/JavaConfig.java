package com.example.springwrongdemo.config;

import com.example.springwrongdemo.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author chrisxu
 * @create 2022-01-16 16:55
 * Ctrl + Alt + L：格式化代码
 * ctrl + Alt + T：代码块包围
 * ctrl + Y：删除行
 * ctrl + D：复制行
 * alt+上/下：移动光标到上/下方法
 * ctrl+shift+/：注释多行
 */
@Configuration
public class JavaConfig {
    /**
     * 这个bean装配给ServiceImpl1的构造器参数
     * * @return
     */
    @Bean("myServiceName")
    public String serviceName() {
        return "myServiceNameValue";
    }
    @Bean("myServiceName2")
    public String serviceName2() {
        return "myServiceName2Value";
    }
    @Bean("student")
    public Student student() {
        return createStudent(1, "xie");
    }

    @Bean("students")
    public List<Student> students() {
        return new ArrayList<>(Arrays.asList(createStudent(1, "xie"),createStudent(2, "liu")));
    }

    private Student createStudent(int id, String name) {
        return new Student(id, name);
    }
}
