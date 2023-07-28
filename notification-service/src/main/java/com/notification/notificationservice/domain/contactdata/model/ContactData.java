package com.notification.notificationservice.domain.contactdata.model;

import jakarta.persistence.*;
import lombok.*;

import static com.notification.notificationservice.core.constants.SequenceName.SEQ_CONTACT_DATA;
import static com.notification.notificationservice.core.constants.TableName.CONTACT_DATA;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = CONTACT_DATA)
public class ContactData {

    @Id
    @SequenceGenerator(allocationSize = 1, name = SEQ_CONTACT_DATA)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_CONTACT_DATA)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String phoneNumber;

}
