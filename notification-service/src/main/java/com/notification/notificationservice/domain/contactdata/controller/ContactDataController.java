package com.notification.notificationservice.domain.contactdata.controller;

import com.notification.notificationservice.domain.contactdata.dto.ContactDataDto;
import com.notification.notificationservice.domain.contactdata.service.ContactDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/contact-data")
public class ContactDataController {
    private final ContactDataService service;

    @GetMapping
    public ResponseEntity<List<ContactDataDto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContactDataDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<ContactDataDto> create(@RequestBody ContactDataDto dto) {
        return ResponseEntity.ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ContactDataDto> update(@PathVariable Long id, @RequestBody ContactDataDto dto) {
        return ResponseEntity.ok(service.update(id, dto));
    }

}
