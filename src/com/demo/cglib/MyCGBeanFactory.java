package com.demo.cglib;

import com.demo.dao.GoodsDao;
import com.demo.jdk.MyAspect;
import jdk.nashorn.internal.runtime.regexp.joni.EncodingHelper;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyCGBeanFactory {
    public static GoodsDao getBean() {
        // 准备目标类
        final GoodsDao goodsDao = new GoodsDao();
        // 创建切面类实例
        final MyAspect aspect = new MyAspect();
        // 生成代理类，CGLIB在运行时，生成指定对象的子类，增强
        Enhancer enhancer = new Enhancer();
        // 确定需要增强的类
        enhancer.setSuperclass(goodsDao.getClass());
        // 添加回调函数
        enhancer.setCallback(new MethodInterceptor() {
            // intercept 相当于 jdk invoke，前三个参数与 jdk invoke—致
            @Override
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                aspect.myBefore();
                // 目标方法执行
                Object object = method.invoke(goodsDao, args);
                aspect.myAfter();
                return object;
            }
        });
        // 创建代理
        GoodsDao goodsDaoProxy = (GoodsDao) enhancer.create();
        return goodsDaoProxy;
    }
}
