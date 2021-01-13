package com.demo.static_factory;

import com.demo.dto.Person2;

public class MyBeanFactory {
    // 创建Bean实例的静态工厂方法
    public static Person2 createBean() {
        return new Person2();
    }
}
