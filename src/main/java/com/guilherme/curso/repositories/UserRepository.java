package com.guilherme.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
