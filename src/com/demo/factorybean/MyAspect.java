package com.demo.factorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 需要实现接口，确定哪个通知，及告诉 Spring 应该执行哪个方法
 */
public class MyAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println(" before executed the method ... ");
        // executed the method
        Object object = invocation.proceed();
        System.out.println(" after executed the method ... ");
        return object;
    }
}
