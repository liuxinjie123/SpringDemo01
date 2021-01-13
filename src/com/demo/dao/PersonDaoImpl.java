package com.demo.dao;

import org.springframework.stereotype.Repository;

@Repository("personDao")
public class PersonDaoImpl implements PersonDao {

    @Override
    public void add() {
        System.out.println(" dao 层的 add() method ... ");
        System.out.println(" executed add() method ... ");
    }
}
