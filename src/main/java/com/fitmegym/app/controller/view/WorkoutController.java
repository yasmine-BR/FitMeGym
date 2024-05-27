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

import com.fitmegym.app.entity.Workout;
import com.fitmegym.app.service.WorkoutService;

@Controller
@RequestMapping("/workouts")
public class WorkoutController {

	@Autowired
	private WorkoutService workoutService;

	@GetMapping
	public String listWorkouts(Model model) {
		List<Workout> workouts = workoutService.listWorkouts();
		model.addAttribute("workouts", workouts);
		return "workouts";
	}

	@PostMapping
	public String addWorkout(@ModelAttribute Workout workout) {
		workoutService.addWorkout(workout);
		return "redirect:/workouts";
	}

	@PostMapping("/delete/{id}")
	public String deleteWorkout(@PathVariable Long id) {
		workoutService.deleteWorkout(id);
		return "redirect:/workouts";
	}
}
