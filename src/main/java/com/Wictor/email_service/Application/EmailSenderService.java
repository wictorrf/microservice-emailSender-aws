package com.Wictor.email_service.Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Wictor.email_service.Adapters.EmailSenderGatway;
import com.Wictor.email_service.Core.EmailSenderUseCase;

@Service
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGatway emailSenderGatway;

    @Autowired
    public EmailSenderService(EmailSenderGatway emailGatway) {
        this.emailSenderGatway = emailGatway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGatway.sendEmail(to, subject, body);
    }

}
