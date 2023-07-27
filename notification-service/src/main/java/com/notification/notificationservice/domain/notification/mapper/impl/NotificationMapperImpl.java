package com.notification.notificationservice.domain.notification.mapper.impl;

import com.notification.notificationservice.domain.notification.dto.NotificationDto;
import com.notification.notificationservice.domain.notification.mapper.NotificationMapper;
import com.notification.notificationservice.domain.notification.model.Notification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class NotificationMapperImpl implements NotificationMapper {

    @Override
    public NotificationDto mapToDto(Notification entity) {
        return NotificationDto.builder()
                .id(entity.getId())
                .title(entity.getTitle())
                .message(entity.getMessage())
                .author(entity.getAuthor())
                .build();
    }

    @Override
    public List<NotificationDto> mapToDtos(List<Notification> entities) {
        return entities.stream().map(this::mapToDto).toList();
    }

    @Override
    public Notification mapToEntity(NotificationDto dto) {
        return Notification.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .message(dto.getMessage())
                .author(dto.getAuthor())
                .build();
    }

}
