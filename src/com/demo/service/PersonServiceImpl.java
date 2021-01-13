package com.demo.service;

import com.demo.dao.PersonDao;

public class PersonServiceImpl implements PersonService {
    // 定义接口声明
    private PersonDao personDao;

    // 提供 setter 方法，用于依赖注入
    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    // 实现接口方法
    @Override
    public void addPerson() {
        personDao.add();
        System.out.println(" executed addPerson() method.");
    }
}
