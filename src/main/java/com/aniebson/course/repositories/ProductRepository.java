package com.aniebson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aniebson.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
