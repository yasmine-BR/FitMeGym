package com.fitmegym.app.controller.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fitmegym.app.entity.Workout;
import com.fitmegym.app.entity.WorkoutJourney;
import com.fitmegym.app.service.WorkoutJourneyService;
import com.fitmegym.app.service.WorkoutService;

@Controller
@RequestMapping("/workoutjourney")
public class WorkoutJourneyController {

	@Autowired
	private WorkoutJourneyService workoutJourneyService;

	@Autowired
	private WorkoutService workoutService;

	@GetMapping
	public String listWorkoutJourney(Model model) {
		List<WorkoutJourney> workoutJourney = workoutJourneyService.listWorkoutJourney();
		List<Workout> workouts = workoutService.listWorkouts();
		model.addAttribute("workoutjourney", workoutJourney);
		model.addAttribute("workouts", workouts);
		return "workoutJourney";
	}

	@PostMapping
	public String addWorkoutToJourney(@RequestParam Long workoutId, @RequestParam String date) {
		Workout workout = workoutService.findWorkoutById(workoutId);
		WorkoutJourney entry = new WorkoutJourney();
		entry.setWorkout(workout);
		entry.setDate(date);
		workoutJourneyService.addWorkoutToJourney(entry);
		return "redirect:/workoutJourney";
	}

	@PostMapping("/delete/{id}")
	public String deleteWorkoutFromJourney(@PathVariable Long id) {
		workoutJourneyService.deleteWorkoutFromJourney(id);
		return "redirect:/workoutJourney";
	}
}
