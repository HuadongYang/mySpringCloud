package com.my.cloud;

import com.my.cloud.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Mr.Yang
 * @create: 2019-11-14 21:43
 **/
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Autowired
    private SendMailService sendMailService;
    @Override
    public void run(String... args) throws Exception {
        sendMailService.send();
    }
}
