package com.compassuol.course.repositories;

import com.compassuol.course.entities.User;
import com.compassuol.course.entities.enums.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
