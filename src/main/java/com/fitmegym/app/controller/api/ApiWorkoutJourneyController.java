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

import com.fitmegym.app.entity.WorkoutJourney;
import com.fitmegym.app.service.WorkoutJourneyService;

@RestController
@RequestMapping("/api/myworkoutjourney")
public class ApiWorkoutJourneyController {

	@Autowired
	private WorkoutJourneyService workoutJourneyService;

	@PostMapping
	public WorkoutJourney addWorkoutToJourney(@RequestBody WorkoutJourney workoutJourney) {
		return workoutJourneyService.addWorkoutToJourney(workoutJourney);
	}

	@GetMapping
	public List<WorkoutJourney> listWorkoutJourney() {
		return workoutJourneyService.listWorkoutJourney();
	}

	@DeleteMapping("/{id}")
	public void deleteWorkoutFromJourney(@PathVariable Long id) {
		workoutJourneyService.deleteWorkoutFromJourney(id);
	}
}
