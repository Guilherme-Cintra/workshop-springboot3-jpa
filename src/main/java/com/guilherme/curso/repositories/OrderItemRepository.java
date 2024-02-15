package com.guilherme.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
