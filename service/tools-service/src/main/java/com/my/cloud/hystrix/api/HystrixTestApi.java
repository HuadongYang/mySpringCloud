package com.my.cloud.hystrix.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hy/test")
public class HystrixTestApi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi(){
        return "hi";
    }
}
