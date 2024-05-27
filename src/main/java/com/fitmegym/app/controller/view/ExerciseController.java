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
import org.springframework.web.bind.annotation.RequestParam;

import com.fitmegym.app.entity.Exercise;
import com.fitmegym.app.service.CategoryService;
import com.fitmegym.app.service.ExerciseService;
import com.fitmegym.app.service.WorkoutService;

@Controller
@RequestMapping("/exercises")
public class ExerciseController {

	@Autowired
	private ExerciseService exerciseService;

	@Autowired
	private WorkoutService workoutService;

	@Autowired
	private CategoryService categoryService;

	@GetMapping
	public String listExercises(Model model) {
		List<Exercise> exercises = exerciseService.listExercises();
		model.addAttribute("exercises", exercises);
		model.addAttribute("workouts", workoutService.listWorkouts());
		model.addAttribute("categories", categoryService.listCategories());
		return "exercises";
	}

	@PostMapping
	public String addExercise(@ModelAttribute Exercise exercise, @RequestParam Long workoutId,
			@RequestParam Long categoryId) {
		exerciseService.addExercise(exercise, workoutId, categoryId);
		return "redirect:/exercises";
	}

	@PostMapping("/delete/{id}")
	public String deleteExercise(@PathVariable Long id) {
		exerciseService.deleteExercise(id);
		return "redirect:/exercises";
	}
}
