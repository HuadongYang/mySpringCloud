package com.my.cloud.test.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/gateway/test")
@RestController
public class GateWayTestApi {

    @RequestMapping("/heart")
    public Boolean heart(){
        return true;
    }
}
