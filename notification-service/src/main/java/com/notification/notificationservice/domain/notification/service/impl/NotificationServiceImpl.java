package com.notification.notificationservice.domain.notification.service.impl;

import com.notification.notificationservice.domain.notification.dto.NotificationDto;
import com.notification.notificationservice.domain.notification.mapper.NotificationMapper;
import com.notification.notificationservice.domain.notification.repository.NotificationRepository;
import com.notification.notificationservice.domain.notification.service.NotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
class NotificationServiceImpl implements NotificationService {

    private final NotificationRepository repository;
    private final NotificationMapper mapper;

    @Override
    public List<NotificationDto> findAll() {
        log.info("NotificationService - findAll");
        return mapper.mapToDtos(repository.findAll());
    }

    @Override
    public NotificationDto findById(Long id) {
        log.info("NotificationService - findById ${}", id);
        final var result = repository.findById(id).orElseThrow();
        return mapper.mapToDto(result);
    }

    @Override
    public NotificationDto create(NotificationDto dto) {
        log.info("NotificationService - create");
        final var entity = mapper.mapToEntity(dto);
        return mapper.mapToDto(repository.save(entity));
    }

    @Override
    public NotificationDto update(Long id, NotificationDto dto) {
        log.info("NotificationService - update");
        repository.findById(id).orElseThrow();
        final var entity = mapper.mapToEntity(dto);
        return mapper.mapToDto(repository.save(entity));
    }

}
