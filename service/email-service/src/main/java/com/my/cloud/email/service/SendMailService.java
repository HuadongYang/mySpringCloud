package com.my.cloud.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;

import javax.mail.MessagingException;

/**
 * @description:
 * @author: Mr.Yang
 * @create: 2019-11-14 21:39
 **/
@Service
public class SendMailService {
    @Autowired
    MailSendService mailSendService;

    @Autowired
    private TemplateEngine templateEngine;

    @Autowired
    private ApplicationContext context;


    public void send() {
        mailSendService.sendSimpleMail(
                "yanghd@glodon.com",
                "hi",
                "how are u",
                null
        );
    }

    public void sendHtml() throws MessagingException, javax.mail.MessagingException {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(context);
        templateResolver.setCacheable(false);
        templateResolver.setPrefix("classpath:/birthday/");
        templateResolver.setSuffix(".html");

        templateEngine.setTemplateResolver(templateResolver);

        Context context = new Context();


        String emailTemplate = templateEngine.process("happy", context);

        mailSendService.sendHtmlMail("979078205@qq.com", "这是一封模板HTML邮件", emailTemplate);
    }



    public void sendHtmlMail2() throws javax.mail.MessagingException, MessagingException {

        Context context = new Context();
        context.setVariable("project", "Spring Boot Demo");
        context.setVariable("author", "Yangkai.Shen");
        context.setVariable("url", "https://bim5d-hunan.glodon.com/resources/birth/happy.html");

        String emailTemplate = templateEngine.process("email/test", context);
        mailSendService.sendHtmlMail("979078205@qq.com", "祝你生日快乐", emailTemplate);
    }

}
