package com.udacity.course3.reviews.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udacity.course3.reviews.entity.Product;
import com.udacity.course3.reviews.entity.Review;

/**
 * Review Repository
 * 
 * @author Ashutosh_Sharma
 *
 */
@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {
	/**
	 * Find all review related to a product
	 * 
	 * @param product
	 * @return
	 */
	List<Review> findAllByProduct(Product product);
}
