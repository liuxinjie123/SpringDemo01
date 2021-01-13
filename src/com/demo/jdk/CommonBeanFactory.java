package com.demo.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CommonBeanFactory {

    public static Object getBean(Class clazz, Object object) {
        // 准备目标类
//        final CustomerDao customerDao = new CustomerDaoImpl();
        // 创建切面类实例
        final MyAspect aspect = new MyAspect();
        // 使用代理类，进行增强
        return Proxy.newProxyInstance(
                MyBeanFactory.class.getClassLoader(),
                new Class[]{clazz},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        aspect.myBefore();
                        Object obj = method.invoke(object, args);
                        aspect.myAfter();
                        return obj;
                    }
                });
    }

}
