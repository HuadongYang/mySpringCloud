package com.my.cloud.jdk.cgclib;

import org.assertj.core.internal.cglib.core.DebuggingClassWriter;
import org.assertj.core.internal.cglib.proxy.Enhancer;

/**
 * Cglib动态代理执行代理方法效率之所以比JDK的高是因为Cglib采用了FastClass机制，它的原理简单来说就是：为代理类和被代理类各生成一个Class，这个Class会为代理类或被代理类的方法分配一个index(int类型)。
 * 这个index当做一个入参，FastClass就可以直接定位要调用的方法直接进行调用，这样省去了反射调用，所以调用效率比JDK动态代理通过反射调用高。
 *
 *  FastClass并不是跟代理类一块生成的，而是在第一次执行MethodProxy invoke/invokeSuper时生成的并放在了缓存中。
 *
 *  Cglib 生成一个被代理对象的子类来作为代理
 */
public class Application {

    public static void main(String[] args) {
        //代理类class文件存入本地磁盘
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PersonService.class);
        enhancer.setCallback(new CglibProxyIntercepter());
        PersonService proxy= (PersonService)  enhancer.create();
        proxy.setPerson();
        proxy.getPerson("1");
    }

}
