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

import com.fitmegym.app.entity.Exercise;
import com.fitmegym.app.service.ExerciseService;

@Controller
@RequestMapping("/exercises")
public class ExerciseController {

	@Autowired
	private ExerciseService exerciseService;

	@GetMapping
	public String listExercises(Model model) {
		List<Exercise> exercises = exerciseService.listExercises();
		model.addAttribute("exercises", exercises);
		return "exercises";
	}

	@PostMapping
	public String addExercise(@ModelAttribute Exercise exercise) {
		exerciseService.addExercise(exercise);
		return "redirect:/exercises";
	}

	@PostMapping("/delete/{id}")
	public String deleteExercise(@PathVariable Long id) {
		exerciseService.deleteExercise(id);
		return "redirect:/exercises";
	}
}
