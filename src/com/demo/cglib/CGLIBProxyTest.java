package com.demo.cglib;

import com.demo.dao.GoodsDao;
import org.junit.jupiter.api.Test;

public class CGLIBProxyTest {
    @Test
    public void test() {
        // 从工厂获得指定的内容（相当于spring获得，但此内容时代理对象）
        GoodsDao goodsDao = MyCGBeanFactory.getBean();
        // 执行方法
        goodsDao.add();
        goodsDao.update();
        goodsDao.delete();
        goodsDao.find();
    }
}
