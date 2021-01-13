package com.demo.factorybean;

import com.demo.dao.CustomerDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {
    @Test
    public void test() {
        String xmlPath = "com/demo/factorybean/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDaoProxy");
        customerDao.add();
        customerDao.update();
        customerDao.delete();
        customerDao.find();
    }
}
