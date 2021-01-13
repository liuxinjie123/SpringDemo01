package com.demo.jdk;

import com.demo.dao.CustomerDao;
import com.demo.dao.CustomerDaoImpl;
import org.junit.jupiter.api.Test;

public class JDKProxyTest {
    @Test
    public void test() {
        // 从工厂获取指定的内容（相当于 spring 获得，但此内容是代理对象）
        CustomerDao customerDao = MyBeanFactory.getBean();
        // executed method
        customerDao.add();
        customerDao.delete();
        customerDao.update();
        customerDao.find();
    }

    @Test
    public void test2() throws IllegalAccessException, InstantiationException {
        // 从工厂获取指定的内容（相当于 spring 获得，但此内容是代理对象）
        CustomerDao customerDao = (CustomerDao) CommonBeanFactory.getBean(CustomerDao.class, CustomerDaoImpl.class.newInstance());
        // executed method
        customerDao.add();
        customerDao.delete();
        customerDao.update();
        customerDao.find();
    }
}
