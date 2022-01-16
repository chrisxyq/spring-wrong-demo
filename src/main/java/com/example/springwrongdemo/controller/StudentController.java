package com.example.springwrongdemo.controller;

import com.example.springwrongdemo.entity.Student;
import com.example.springwrongdemo.service.DataService;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chrisxu
 * @create 2022-01-16 17:23
 * Ctrl + Alt + L：格式化代码
 * ctrl + Alt + T：代码块包围
 * ctrl + Y：删除行
 * ctrl + D：复制行
 * alt+上/下：移动光标到上/下方法
 * ctrl+shift+/：注释多行
 */
@RestController
@Slf4j
@Validated
public class StudentController {
    @Autowired
    @Qualifier("CassandraDataService")
    DataService dataService;
    @Autowired
    @Qualifier("students")
    private List<Student> students;

    public StudentController(List<Student> students) {
        this.students = students;
    }

    @RequestMapping(path = "students")
    public String listStudents() {
        return students.toString();
    }

    @RequestMapping(path = "students/{id}")
    public void deleteStudent(@PathVariable("id") @Range(min = 1, max = 100) int id) {
        dataService.deleteStudent(id);
    }
}
