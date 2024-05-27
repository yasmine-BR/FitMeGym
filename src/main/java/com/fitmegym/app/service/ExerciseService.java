package com.fitmegym.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitmegym.app.entity.Exercise;
import com.fitmegym.app.repository.CategoryRepository;
import com.fitmegym.app.repository.ExerciseRepository;
import com.fitmegym.app.repository.WorkoutRepository;

@Service
public class ExerciseService {

	@Autowired
	private ExerciseRepository exerciseRepository;

	@Autowired
	private WorkoutRepository workoutRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	public Exercise addExercise(Exercise exercise, Long workoutId, Long categoryId) {
		exercise.setWorkout(workoutRepository.findById(workoutId).orElse(null));
		exercise.setCategory(categoryRepository.findById(categoryId).orElse(null));
		return exerciseRepository.save(exercise);
	}

	public List<Exercise> listExercises() {
		return exerciseRepository.findAll();
	}

	public void deleteExercise(Long id) {
		exerciseRepository.deleteById(id);
	}
}
