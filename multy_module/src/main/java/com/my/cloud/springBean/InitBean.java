package com.my.cloud.springBean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:
 * @author: Mr.Yang
 * @create: 2019-11-14 11:03
 **/

public class InitBean implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("after initbean");
    }
}
