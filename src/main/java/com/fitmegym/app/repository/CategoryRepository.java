package com.fitmegym.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fitmegym.app.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
