package com.my.cloud.hystrix.service;

import org.springframework.stereotype.Service;

@Service
public class HiService {

    public String hi(){
        return "hi";
    }
}
