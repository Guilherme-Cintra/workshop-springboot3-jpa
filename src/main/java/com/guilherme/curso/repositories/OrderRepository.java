package com.guilherme.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}