package com.notification.notificationservice.domain.contactdata.mapper;

import com.notification.notificationservice.domain.contactdata.dto.ContactDataDto;
import com.notification.notificationservice.domain.contactdata.model.ContactData;

import java.util.List;

public interface ContactDataMapper {
    ContactDataDto mapToDto(ContactData contactData);

    List<ContactDataDto> mapToDtos(List<ContactData> contactDataList);

    ContactData mapToEntity(ContactDataDto contactDataDto);
}
