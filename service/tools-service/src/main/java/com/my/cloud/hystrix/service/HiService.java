package com.my.cloud.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

@Service
public class HiService {

    @HystrixCommand(fallbackMethod = "timeoutFallback", threadPoolProperties = {
            @HystrixProperty(name = "coreSize", value = "1"),
            @HystrixProperty(name = "queueSizeRejectionThreshold", value = "20")
    }, commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "8")
    })
    public String hi() throws InterruptedException {
        Thread.sleep(200);
        return "hi";
    }

    public String timeoutFallback() {
        return "timeout 降级";
    }
}
