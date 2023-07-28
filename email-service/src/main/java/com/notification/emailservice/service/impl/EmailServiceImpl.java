package com.notification.emailservice.service.impl;

import com.notification.emailservice.dto.MailDto;
import com.notification.emailservice.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class EmailServiceImpl implements EmailService {

    private final JavaMailSender emailSender;

    @Override
    public void sendMail(MailDto dto) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(dto.getRecipient());
        message.setSubject(dto.getTitle());
        message.setText(dto.getMessage());
        emailSender.send(message);
    }

}