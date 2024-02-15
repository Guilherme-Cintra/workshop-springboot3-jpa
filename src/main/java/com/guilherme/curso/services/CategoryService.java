package com.guilherme.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.curso.entities.Category;
import com.guilherme.curso.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository CategoryRepository;
	
	public List<Category> findAll() {
		return CategoryRepository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> objt = CategoryRepository.findById(id);
		return objt.get();
	}
}
