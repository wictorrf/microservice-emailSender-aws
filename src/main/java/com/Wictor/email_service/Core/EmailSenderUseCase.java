package com.Wictor.email_service.Core;

public interface EmailSenderUseCase {

    void sendEmail(String to, String subject, String body);

}
