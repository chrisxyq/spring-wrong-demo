package com.example.springwrongdemo.controller;

import com.example.springwrongdemo.config.TakeTime;
import com.example.springwrongdemo.service.ElectricService;
import com.example.springwrongdemo.service.ElectricService1;
import com.example.springwrongdemo.service.ElectricService2;
import com.example.springwrongdemo.service.ElectricService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chrisxu
 * @create 2022-01-16 21:52
 * Ctrl + Alt + L：格式化代码
 * ctrl + Alt + T：代码块包围
 * ctrl + Y：删除行
 * ctrl + D：复制行
 * alt+上/下：移动光标到上/下方法
 * ctrl+shift+/：注释多行
 */
@RestController
public class ElectricController {
    @Autowired
    ElectricService electricService;
    @Autowired
    ElectricService1 electricService1;
    @Autowired
    ElectricService2 electricService2;
    @Autowired
    ElectricService3 electricService3;
    @TakeTime
    @RequestMapping(path = "charge")
    public void charge() throws InterruptedException {
        electricService.charge();
    }

    @RequestMapping(path = "charge1")
    public void charge1() throws InterruptedException {
        electricService1.charge();
    }


    /**
     * 不能直接从代理类中拿代理类的属性
     *
     * @throws InterruptedException
     */
    @RequestMapping(path = "charge3")
    public void charge3() throws InterruptedException {
        electricService2.charge();
    }

    /**
     * 解决：不能直接从代理类中拿代理类的属性
     *
     * @throws InterruptedException
     */
    @RequestMapping(path = "charge4")
    public void charge4() throws InterruptedException {
        electricService3.charge();
    }
}
