package com.notification.notificationservice.domain.contactdata.repository;

import com.notification.notificationservice.domain.contactdata.model.ContactData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactDataRepository extends JpaRepository<ContactData, Long> {
}
