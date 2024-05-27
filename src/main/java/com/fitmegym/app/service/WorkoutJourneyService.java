package com.fitmegym.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitmegym.app.entity.WorkoutJourney;
import com.fitmegym.app.repository.WorkoutJourneyRepository;

@Service
public class WorkoutJourneyService {

	@Autowired
    private WorkoutJourneyRepository workoutJourneyRepository;

    public WorkoutJourney addWorkoutToJourney(WorkoutJourney workoutJourney) {
        return workoutJourneyRepository.save(workoutJourney);
    }

    public List<WorkoutJourney> listWorkoutJourney() {
        return workoutJourneyRepository.findAll();
    }

    public void deleteWorkoutFromJourney(Long id) {
        workoutJourneyRepository.deleteById(id);
    }

}
