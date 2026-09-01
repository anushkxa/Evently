package com.example.evt_core_service.dto;

import com.example.evt_core_service.entity.EventStatus;
import jakarta.validation.constraints.NotNull;

public record UpdateStatusRequest(
        @NotNull EventStatus newStatus
        ) {
}
