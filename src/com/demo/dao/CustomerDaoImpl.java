package com.demo.dao;

import org.springframework.stereotype.Repository;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void add() {
        System.out.println(" add ... ");
    }

    @Override
    public void update() {
        System.out.println(" update ... ");
    }

    @Override
    public void delete() {
        System.out.println(" delete ... ");
    }

    @Override
    public void find() {
        System.out.println(" find ... ");
    }
}
