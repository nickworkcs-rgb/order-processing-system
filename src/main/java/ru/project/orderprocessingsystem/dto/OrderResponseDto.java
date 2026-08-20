package ru.project.orderprocessingsystem.dto;

import ru.project.orderprocessingsystem.models.OrderStatus;

import java.time.Instant;
import java.util.List;

public record OrderResponseDto(Long id, OrderStatus status, Instant createdAt, List<ProductResponseDto> products) {
}
