package com.my.cloud.jdk.dynamicProxy;

import javafx.beans.InvalidationListener;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: Mr.Wang
 * @create: 2019-11-02 14:52
 **/
public class SubjectProxy implements InvocationHandler {

    private Object realObject;

    public SubjectProxy(Object realObject){
        this.realObject = realObject;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(proxy, args);
        return null;
    }
}
