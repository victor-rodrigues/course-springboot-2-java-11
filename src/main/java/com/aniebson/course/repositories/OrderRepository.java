package com.aniebson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aniebson.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
