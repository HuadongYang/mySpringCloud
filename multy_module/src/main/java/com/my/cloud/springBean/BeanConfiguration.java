package com.my.cloud.springBean;

import org.springframework.context.annotation.Bean;

/**
 * @description:
 * @author: Mr.Yang
 * @create: 2019-11-14 11:08
 **/
@org.springframework.context.annotation.Configuration
public class BeanConfiguration {

    @Bean
    public InitBean getInitBean(){
        return new InitBean();
    }
}
