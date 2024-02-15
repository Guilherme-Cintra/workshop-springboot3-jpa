package com.guilherme.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.curso.entities.User;
import com.guilherme.curso.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> objt = userRepository.findById(id);
		return objt.get();
	}
	
	public User insert(User obj) {
		return userRepository.save(obj);
	}
}
