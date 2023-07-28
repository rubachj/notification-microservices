package com.notification.notificationservice.domain.contactdata.service;

import com.notification.notificationservice.domain.contactdata.dto.ContactDataDto;

import java.util.List;

public interface ContactDataService {

    List<ContactDataDto> findAll();

    ContactDataDto findById(Long id);

    ContactDataDto create(ContactDataDto dto);

    ContactDataDto update(Long id, ContactDataDto dto);

}
