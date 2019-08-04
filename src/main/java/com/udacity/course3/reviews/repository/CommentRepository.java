package com.udacity.course3.reviews.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udacity.course3.reviews.entity.Comment;
import com.udacity.course3.reviews.entity.Review;

/**
 * The Interface CommentRepository.
 * 
 * @author ashutosh_sharma
 */
@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer> {
	
	/**
	 * Find all by review.
	 *
	 * @param review the review
	 * @return the list of review
	 */
	List<Comment> findAllByReview(Review review);
}
