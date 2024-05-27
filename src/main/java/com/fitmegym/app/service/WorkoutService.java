package com.fitmegym.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitmegym.app.entity.Workout;
import com.fitmegym.app.repository.WorkoutRepository;

@Service
public class WorkoutService {

	@Autowired
	private WorkoutRepository workoutRepository;

	public Workout addWorkout(Workout workout) {
		return workoutRepository.save(workout);
	}

	public List<Workout> listWorkouts() {
		return workoutRepository.findAll();
	}

	public void deleteWorkout(Long id) {
		workoutRepository.deleteById(id);
	}

}
