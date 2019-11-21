package com.my.cloud.jdk.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @description:
 *
 * BranchDao branchDao = sqlSession.getMapper(BranchDao.class);
 * mybatis的getMapper方法就使用了动态代理生成实例
 *
 * 利用反射机制生成一个实现代理接口的匿名类
 *
 *
 * @author: Mr.Yang
 * @create: 2019-11-02 14:56
 **/
public class Application {

    public static void main(String[] args) {
        SubjectProxy subjectProxy = new SubjectProxy(new RealSubject());

        Subject subject = (Subject) Proxy.newProxyInstance(
                subjectProxy.getClass().getClassLoader(),
                new Class[]{Subject.class},
                subjectProxy
        );


        subject.rent();
    }
}
