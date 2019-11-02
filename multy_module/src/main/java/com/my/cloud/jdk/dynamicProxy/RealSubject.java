package com.my.cloud.jdk.dynamicProxy;

/**
 * @description:
 * @author: Mr.Wang
 * @create: 2019-11-02 14:51
 **/
public class RealSubject implements Subject {

    public void rent() {
        System.out.println("this is RealSubjectS");
    }
}
