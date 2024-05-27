package com.fitmegym.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitmegym.app.entity.Exercise;
import com.fitmegym.app.repository.ExerciseRepository;

@Service
public class ExerciseService {

	@Autowired
	private ExerciseRepository exerciseRepository;

	public Exercise addExercise(Exercise exercise) {
		return exerciseRepository.save(exercise);
	}

	public List<Exercise> listExercises() {
		return exerciseRepository.findAll();
	}

	public void deleteExercise(Long id) {
		exerciseRepository.deleteById(id);
	}
}
