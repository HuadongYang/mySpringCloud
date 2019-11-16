package com.my.cloud;

import com.my.cloud.email.service.SendMailService;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailApplicationTest {

    @Autowired
    SendMailService sendMailService;

    @Test
    public void sendHtml() throws MessagingException, javax.mail.MessagingException {
        sendMailService.sendHtml();
    }

    @Test
    public void sendHtml2() throws MessagingException, javax.mail.MessagingException {
        sendMailService.sendHtmlMail2();
    }
}
