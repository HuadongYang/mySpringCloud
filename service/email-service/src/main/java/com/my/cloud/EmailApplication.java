package com.my.cloud;

import com.my.cloud.email.service.SendMailService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @description:
 * @author: Mr.Yang
 * @create: 2019-11-14 21:36
 **/
@SpringBootApplication
@EnableScheduling
public class EmailApplication {


    public static void main(String[] args) {
        SpringApplication.run(EmailApplication.class, args);

    }
}
