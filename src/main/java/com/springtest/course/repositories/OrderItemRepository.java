package com.springtest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtest.course.entities.OrderItem;
import com.springtest.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {
	
}
