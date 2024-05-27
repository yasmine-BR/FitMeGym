package com.fitmegym.app.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fitmegym.app.entity.Category;
import com.fitmegym.app.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class ApiCategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public List<Category> listCategories() {
		return categoryService.listCategories();
	}

	@GetMapping("/{id}")
	public Category getCategoryById(@PathVariable Long id) {
		return categoryService.getCategoryById(id);
	}

	@PostMapping
	public Category addCategory(@RequestBody Category category) {
		return categoryService.addCategory(category);
	}

	@PutMapping("/{id}")
	public Category updateCategory(@PathVariable Long id, @RequestBody Category category) {
		category.setId(id);
		return categoryService.updateCategory(category);
	}

	@DeleteMapping("/{id}")
	public void deleteCategory(@PathVariable Long id) {
		categoryService.deleteCategory(id);
	}
}
