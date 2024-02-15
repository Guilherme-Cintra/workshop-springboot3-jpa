package com.guilherme.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}