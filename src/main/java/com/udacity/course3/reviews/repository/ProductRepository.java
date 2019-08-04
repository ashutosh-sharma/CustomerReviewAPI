package com.udacity.course3.reviews.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udacity.course3.reviews.entity.Product;


/**
 * The Interface ProductRepository.
 * 
 * @author Ashutosh_Sharma
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
