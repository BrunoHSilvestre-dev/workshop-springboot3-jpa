package com.springtest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtest.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
