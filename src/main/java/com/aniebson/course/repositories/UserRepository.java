package com.aniebson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aniebson.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
