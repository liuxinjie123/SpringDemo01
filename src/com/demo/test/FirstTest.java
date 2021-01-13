package com.demo.test;

import com.demo.dao.PersonDao;
import com.demo.service.PersonService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstTest {
    @Test
    public void testl() {
        // 定义Spring配置文件的路径
        String xmlPath = "applicationContext.xml";
        // 初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // 通过容器获取 personDao 实例
        PersonDao personDao = (PersonDao) applicationContext.getBean("personDao");
        // 调用 personDao 的 add ()方法
        personDao.add();
    }

    @Test
    public void test2() {
        // 定义Spring配置文件的路径
        String xmlPath = "applicationContext.xml";
        // 初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // 通过容器获取 personService 实例
        PersonService personService = (PersonService) applicationContext.getBean("personService");
        // 调用 personService 的 addPerson ()方法
        personService.addPerson();
    }

    @Test
    public void test3() {
        // 定义Spring配置文件的路径
        String xmlPath = "applicationContext.xml";
        // 初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // 通过容器获取id为 person 的实例
        System.out.println(applicationContext.getBean("person"));
    }

    @Test
    public void test4() {
        // 定义Spring配置文件的路径
        String xmlPath = "com/demo/static_factory/applicationContext.xml";
        // 初始化Spring容器，加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        // 通过容器获取id为 person 的实例
        System.out.println(context.getBean("person2"));
    }
}
