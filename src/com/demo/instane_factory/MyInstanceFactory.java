package com.demo.instane_factory;

import com.demo.dto.Person3;

public class MyInstanceFactory {
    public MyInstanceFactory() {
        System.out.println(" person3 实例化工厂");
    }

    // 创建 Bean 的方法
    public Person3 createBean() {
        return new Person3();
    }
}
