package com.fitmegym.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fitmegym.app.entity.WorkoutJourney;

@Repository
public interface WorkoutJourneyRepository  extends JpaRepository<WorkoutJourney, Long> {
}
