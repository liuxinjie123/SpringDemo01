package com.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    @Test
    public void test() {
        // 定义Spring配置文件路径
        String xmlPath = "com/demo/controller/applicationContext.xml";
        // 初始化Spring容器，加载配置文件，并对bean进行实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // 获得personAction实例
        PersonController personAction = (PersonController) applicationContext.getBean("personController");
        // 调用personAction中的add()方法
        personAction.add();
    }
}
