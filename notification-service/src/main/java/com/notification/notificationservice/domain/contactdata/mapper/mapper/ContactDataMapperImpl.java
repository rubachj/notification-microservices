package com.notification.notificationservice.domain.contactdata.mapper.mapper;

import com.notification.notificationservice.domain.contactdata.dto.ContactDataDto;
import com.notification.notificationservice.domain.contactdata.mapper.ContactDataMapper;
import com.notification.notificationservice.domain.contactdata.model.ContactData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class ContactDataMapperImpl implements ContactDataMapper {
    @Override
    public ContactDataDto mapToDto(ContactData contactData) {
        return ContactDataDto.builder()
                .id(contactData.getId())
                .name(contactData.getName())
                .surname(contactData.getSurname())
                .email(contactData.getEmail())
                .phoneNumber(contactData.getPhoneNumber())
                .build();
    }

    @Override
    public List<ContactDataDto> mapToDtos(List<ContactData> contactDataList) {
        return contactDataList.stream().map(this::mapToDto).toList();
    }

    @Override
    public ContactData mapToEntity(ContactDataDto contactDataDto) {
        return ContactData.builder()
                .id(contactDataDto.getId())
                .name(contactDataDto.getName())
                .surname(contactDataDto.getSurname())
                .email(contactDataDto.getEmail())
                .phoneNumber(contactDataDto.getPhoneNumber())
                .build();
    }

}
