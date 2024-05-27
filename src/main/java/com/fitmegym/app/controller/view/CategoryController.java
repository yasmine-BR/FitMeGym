package com.fitmegym.app.controller.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fitmegym.app.entity.Category;
import com.fitmegym.app.service.CategoryService;

@Controller
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public String listCategories(Model model) {
		List<Category> categories = categoryService.listCategories();
		model.addAttribute("categories", categories);
		return "categories";
	}

	@PostMapping
	public String addCategory(@ModelAttribute Category category) {
		categoryService.addCategory(category);
		return "redirect:/categories";
	}

	@PostMapping("/delete/{id}")
	public String deleteCategory(@PathVariable Long id) {
		categoryService.deleteCategory(id);
		return "redirect:/categories";
	}
}
