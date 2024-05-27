package com.fitmegym.app.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fitmegym.app.entity.Workout;
import com.fitmegym.app.service.WorkoutService;

@RestController
@RequestMapping("/api/workouts")
public class ApiWorkoutController {

	@Autowired
	private WorkoutService workoutService;

	@PostMapping
	public Workout addWorkout(@RequestBody Workout workout) {
		return workoutService.addWorkout(workout);
	}

	@GetMapping
	public List<Workout> listWorkouts() {
		return workoutService.listWorkouts();
	}

	@DeleteMapping("/{id}")
	public void deleteWorkout(@PathVariable Long id) {
		workoutService.deleteWorkout(id);
	}
}
