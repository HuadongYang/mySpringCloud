package com.my.cloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public DocketBean getDocketBean() throws Exception {
        return new DocketBean();
    }
}
