package com.fitmegym.app.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fitmegym.app.entity.Exercise;
import com.fitmegym.app.service.ExerciseService;

@RestController
@RequestMapping("/api/exercises")
public class ApiExerciseController {

	@Autowired
	private ExerciseService exerciseService;

	@GetMapping
	public List<Exercise> listExercises() {
		return exerciseService.listExercises();
	}

	@PostMapping
	public Exercise addExercise(@RequestBody Exercise exercise, @RequestParam Long workoutId,
			@RequestParam Long categoryId) {
		return exerciseService.addExercise(exercise, workoutId, categoryId);
	}

	@DeleteMapping("/{id}")
	public void deleteExercise(@PathVariable Long id) {
		exerciseService.deleteExercise(id);
	}
}
