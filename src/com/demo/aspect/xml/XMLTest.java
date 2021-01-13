package com.demo.aspect.xml;

import com.demo.dao.CustomerDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLTest {
    @Test
    public void test() {
        String xmlPath = "com/demo/aspect/xml/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        // 从spring容器获取实例
        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
        // 执行方法
        customerDao.add();
    }
}
