package com.my.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 路由：
 * 如果不设置路由规则，默认serviceId和path相等
 * PatternServiceRouteMapper可以设置路由规则
 *
 * 如果找不到path对应的serviceId，pre的filter不会执行，应该是zuul的优化（pre会在route之前执行）
 *
 * hystrix：
 * zuul已经集成了hustrix
 *
 *
 * timeout:
 * 如果service在规则时间内没有返回，网关直接超时
 *
 * Test:
 * localhost:8001/api/v1/tools-service/gateway/test/heart
 */

@SpringCloudApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class);
    }
}
