package com.fitmegym.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitmegym.app.entity.Category;
import com.fitmegym.app.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	public Category addCategory(Category category) {
		return categoryRepository.save(category);
	}

	public List<Category> listCategories() {
		return categoryRepository.findAll();
	}

	public void deleteCategory(Long id) {
		categoryRepository.deleteById(id);
	}
}
