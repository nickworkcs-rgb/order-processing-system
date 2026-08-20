package ru.project.orderprocessingsystem.dto;

import ru.project.orderprocessingsystem.models.Product;

import java.util.List;

public record OrderCreateRequestDto(List<Product> products) {
}
