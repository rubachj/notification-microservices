package com.notification.notificationservice.domain.contactdata.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContactDataDto {
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;
}
