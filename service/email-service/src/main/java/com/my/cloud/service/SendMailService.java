package com.my.cloud.service;

import com.my.cloud.email.service.MailSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Mr.Yang
 * @create: 2019-11-14 21:39
 **/
@Service
public class SendMailService {
    @Autowired
    MailSendService MailSendService;

    public void send(){
        MailSendService.sendSimpleMail(
                "yanghd@glodon.com",
                "hi",
                "how are u",
                null
        );
    }
}
