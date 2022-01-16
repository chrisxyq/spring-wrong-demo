package com.example.springwrongdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

/**
 * @author chrisxu
 * @create 2022-01-16 17:21
 * Ctrl + Alt + L：格式化代码
 * ctrl + Alt + T：代码块包围
 * ctrl + Y：删除行
 * ctrl + D：复制行
 * alt+上/下：移动光标到上/下方法
 * ctrl+shift+/：注释多行
 */
@Repository("CassandraDataService")
@Slf4j
public class CassandraDataService implements DataService{
    @Override
    public void deleteStudent(int id) {
        log.info("Cassandra");
    }
}
