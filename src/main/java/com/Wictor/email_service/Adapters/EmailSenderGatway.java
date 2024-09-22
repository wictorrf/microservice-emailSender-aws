package com.Wictor.email_service.Adapters;

public interface EmailSenderGatway {
    void sendEmail(String to, String subject, String body);
}
