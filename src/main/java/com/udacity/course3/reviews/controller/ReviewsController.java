package com.udacity.course3.reviews.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.udacity.course3.reviews.entity.Product;
import com.udacity.course3.reviews.entity.Review;
import com.udacity.course3.reviews.repository.ProductRepository;
import com.udacity.course3.reviews.repository.ReviewRepository;

/**
 * Spring REST controller for working with review entity.
 */
@RestController
public class ReviewsController {

	@Autowired
	ReviewRepository reviewRepository;
	
	@Autowired
	ProductRepository productRepository;

	/**
	 * Creates a review for a product.
	 * <p>
	 * 1. Add argument for review entity. Use {@link RequestBody} annotation. 2.
	 * Check for existence of product. 3. If product not found, return NOT_FOUND. 4.
	 * If found, save review.
	 *
	 * @param productId The id of the product.
	 * @return The created review or 404 if product id is not found.
	 */
	@RequestMapping(value = "/reviews/products/{productId}", method = RequestMethod.POST)
	public ResponseEntity<?> createReviewForProduct(@PathVariable("productId") Integer productId,
			@RequestBody Review review) {
		Optional<Product> product = productRepository.findById(productId);
		if (product.isPresent()) {
			review.setProduct(product.get());
			return ResponseEntity.ok(reviewRepository.save(review));
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	/**
	 * Lists reviews by product.
	 *
	 * @param productId The id of the product.
	 * @return The list of reviews.
	 */
	@RequestMapping(value = "/reviews/products/{productId}", method = RequestMethod.GET)
	public ResponseEntity<List<?>> listReviewsForProduct(@PathVariable("productId") Integer productId) {
		
		List<Review> reviewList = reviewRepository.findAllByProduct(new Product(productId));
		if(reviewList.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		else {
			return ResponseEntity.ok(reviewList);
		}
	}
}