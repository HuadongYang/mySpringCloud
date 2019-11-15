package com.my.cloud;

import com.my.cloud.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: Mr.Yang
 * @create: 2019-11-14 21:36
 **/
@SpringBootApplication
public class EmailApplication {


    public static void main(String[] args) {
        SpringApplication.run(EmailApplication.class, args);

    }
}
