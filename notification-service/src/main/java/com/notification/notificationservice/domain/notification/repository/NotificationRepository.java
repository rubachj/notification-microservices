package com.notification.notificationservice.domain.notification.repository;

import com.notification.notificationservice.domain.notification.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
