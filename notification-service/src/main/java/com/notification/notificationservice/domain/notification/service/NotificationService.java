package com.notification.notificationservice.domain.notification.service;

import com.notification.notificationservice.domain.notification.dto.NotificationDto;

import java.util.List;

public interface NotificationService {

    List<NotificationDto> findAll();

    NotificationDto findById(Long id);

    NotificationDto create(NotificationDto dto);

    NotificationDto update(Long id, NotificationDto dto);

}
