package com.notification.notificationservice.domain.notification.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class NotificationDto {

    private Long id;
    private String title;
    private String message;
    private String author;

}
