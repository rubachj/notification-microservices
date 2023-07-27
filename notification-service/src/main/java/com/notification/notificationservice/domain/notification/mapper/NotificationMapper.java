package com.notification.notificationservice.domain.notification.mapper;

import com.notification.notificationservice.domain.notification.dto.NotificationDto;
import com.notification.notificationservice.domain.notification.model.Notification;

import java.util.List;

public interface NotificationMapper {

    NotificationDto mapToDto(Notification entity);

    List<NotificationDto> mapToDtos(List<Notification> entities);

    Notification mapToEntity(NotificationDto dto);

}
