package com.example.evt_core_service.dto;

import com.example.evt_core_service.entity.EventCategory;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.util.UUID;

public record CreateEventRequest(
        @NotBlank String eventName,
        @NotNull UUID organizerId,
        @NotBlank String organizerName,
        @NotBlank @Pattern(regexp = "\\d{10}", message = "must be a 10-digit mobile number") String organizerMobile,
        @NotBlank String city,
        @NotNull EventCategory category
) {
}
