package com.my.cloud.quartz.service;

import com.my.cloud.email.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

/**
 * @description:
 * @author: Mr.Yang
 * @create: 2019-11-16 15:15
 **/
@Service
public class EmailPush {
    @Autowired
    SendMailService sendMailService;

    @Scheduled(cron = "* 30 16 * * ?")
    public void push() throws MessagingException, MessagingException {
        System.out.println("push");
        sendMailService.sendHtmlMail2();
    }
}
