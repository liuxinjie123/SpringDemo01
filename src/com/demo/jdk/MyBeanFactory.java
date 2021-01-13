package com.demo.jdk;

import com.demo.dao.CustomerDao;
import com.demo.dao.CustomerDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyBeanFactory {

    public static CustomerDao getBean() {
        // 准备目标类
        final CustomerDao customerDao = new CustomerDaoImpl();
        // 创建切面类实例
        final MyAspect aspect = new MyAspect();
        // 使用代理类，进行增强
        return (CustomerDao) Proxy.newProxyInstance(
                CommonBeanFactory.class.getClassLoader(),
                new Class[]{CustomerDao.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        aspect.myBefore();
                        Object obj = method.invoke(customerDao, args);
                        aspect.myAfter();
                        return obj;
                    }
                });
    }
}
