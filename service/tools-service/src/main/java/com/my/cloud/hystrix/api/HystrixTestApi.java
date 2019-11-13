package com.my.cloud.hystrix.api;

import com.my.cloud.hystrix.service.HiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api("hystrix test")
@RestController
@RequestMapping("/hy/test")
public class HystrixTestApi {

    @Autowired
    HiService hiService;

    @ApiOperation("hi")
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi() throws InterruptedException {
        return hiService.hi();
    }
}
