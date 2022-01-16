//package com.example.springwrongdemo.service;
//
//import org.springframework.stereotype.Service;
//
///**
// * @author chrisxu
// * @create 2022-01-16 16:39
// * Ctrl + Alt + L：格式化代码
// * ctrl + Alt + T：代码块包围
// * ctrl + Y：删除行
// * ctrl + D：复制行
// * alt+上/下：移动光标到上/下方法
// * ctrl+shift+/：注释多行
// */
//@Service
//public class ServiceImpl {
//    private String serviceName;
//
//    /**
//     * Description:
//     * Parameter 0 of constructor in com.example.springwrongdemo.service.ServiceImpl
//     * required a bean of type 'java.lang.String' that could not be found.
//     *
//     * Action:
//     * Consider defining a bean of type 'java.lang.String' in your configuration.
//     * 隐式规则：
//     * 定义了ServiceImpl为bean，如果再显示定义了构造器，spring会在bean中寻找对应的构造器参数的bean
//     * 然后反射创建出这个bean
//     * @param serviceName
//     */
//    public ServiceImpl(String serviceName) {
//        this.serviceName = serviceName;
//    }
//}
