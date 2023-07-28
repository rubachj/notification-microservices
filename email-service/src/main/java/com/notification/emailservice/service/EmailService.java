package com.notification.emailservice.service;

import com.notification.emailservice.dto.MailDto;

public interface EmailService {

    void sendMail(MailDto mailDto);

}
