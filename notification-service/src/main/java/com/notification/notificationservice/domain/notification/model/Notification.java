package com.notification.notificationservice.domain.notification.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

import static com.notification.notificationservice.core.constants.SequenceName.SEQ_NOTIFICATION;
import static com.notification.notificationservice.core.constants.TableName.NOTIFICATION;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = NOTIFICATION)
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_NOTIFICATION)
    @SequenceGenerator(allocationSize = 1, name = SEQ_NOTIFICATION)
    private Long id;
    private String title;
    private String message;
    private String author;

}
