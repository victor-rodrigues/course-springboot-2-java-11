package com.aniebson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aniebson.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
