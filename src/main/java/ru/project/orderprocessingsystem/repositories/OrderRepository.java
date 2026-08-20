package ru.project.orderprocessingsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.project.orderprocessingsystem.models.Order;
import ru.project.orderprocessingsystem.models.OrderStatus;
import ru.project.orderprocessingsystem.models.Product;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByStatus(OrderStatus status);
}
