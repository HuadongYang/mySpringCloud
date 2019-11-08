package com.my.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableEurekaClient
@SpringCloudApplication
@EnableAutoConfiguration(exclude = {

})
@EnableSwagger2
public class ToolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToolsApplication.class, args);
    }
}
