package com.notification.emailservice.dto;

import lombok.Data;

@Data
public class MailDto {

    private String recipient;
    private String title;
    private String message;

}

