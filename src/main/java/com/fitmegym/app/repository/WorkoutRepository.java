package com.fitmegym.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fitmegym.app.entity.Workout;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {
}