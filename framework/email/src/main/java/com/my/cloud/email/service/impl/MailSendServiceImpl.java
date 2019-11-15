package com.my.cloud.email.service.impl;

import com.my.cloud.email.service.MailSendService;
import com.sun.deploy.util.ArrayUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
/**
 * @description:
 * @author: Mr.Yang
 * @create: 2019-11-14 21:14
 **/
@Service
public class MailSendServiceImpl implements MailSendService {
    @Autowired
    private JavaMailSender mailSender;
    private String from = "979078205@qq.com";

    @Override
    public void sendSimpleMail(String to, String subject, String content, String... cc) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        if (cc != null) {
            message.setCc(cc);
        }
        mailSender.send(message);
    }

    @Override
    public void sendHtmlMail(String to, String subject, String content, String... cc)  {

    }

    @Override
    public void sendAttachmentsMail(String to, String subject, String content, String filePath, String... cc)  {

    }

    @Override
    public void sendResourceMail(String to, String subject, String content, String rscPath, String rscId, String... cc)  {

    }
}
