package com.guilherme.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}