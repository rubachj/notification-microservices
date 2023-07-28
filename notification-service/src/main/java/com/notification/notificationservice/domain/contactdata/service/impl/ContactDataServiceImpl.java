package com.notification.notificationservice.domain.contactdata.service.impl;

import com.notification.notificationservice.domain.contactdata.dto.ContactDataDto;
import com.notification.notificationservice.domain.contactdata.mapper.ContactDataMapper;
import com.notification.notificationservice.domain.contactdata.repository.ContactDataRepository;
import com.notification.notificationservice.domain.contactdata.service.ContactDataService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
class ContactDataServiceImpl implements ContactDataService {

    private final ContactDataRepository repository;
    private final ContactDataMapper mapper;

    @Override
    public List<ContactDataDto> findAll() {
        log.info("ContactDataService - findAll");
        return mapper.mapToDtos(repository.findAll());
    }

    @Override
    public ContactDataDto findById(Long id) {
        log.info("ContactDataService - findById ${}", id);
        final var result = repository.findById(id).orElseThrow();
        return mapper.mapToDto(result);
    }

    @Override
    public ContactDataDto create(ContactDataDto dto) {
        log.info("ContactDataService - create");
        final var entity = mapper.mapToEntity(dto);
        return mapper.mapToDto(repository.save(entity));
    }

    @Override
    public ContactDataDto update(Long id, ContactDataDto dto) {
        log.info("ContactDataService - update");
        repository.findById(id).orElseThrow();
        final var entity = mapper.mapToEntity(dto);
        return mapper.mapToDto(repository.save(entity));
    }

}
