package com.springtest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtest.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
