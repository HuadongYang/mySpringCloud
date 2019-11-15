package com.my.cloud.springBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ResourceLoader;

/**
 * @description:
 * @author: Mr.Yang
 * @create: 2019-11-14 11:07
 **/
@ComponentScan
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.my.cloud");


    }
}
