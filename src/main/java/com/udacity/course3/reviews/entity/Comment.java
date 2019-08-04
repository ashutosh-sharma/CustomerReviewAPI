package com.udacity.course3.reviews.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The Class Comment.
 */
@Entity
@Table(name = "comment")
public class Comment {

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /** The headline. */
    private String headline;

    /** The content. */
    private String content;

    /** The review. */
    @ManyToOne
    private Review review;

    /**
     * Gets the id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(Integer id) {
        this.id = id;
    }

	/**
	 * Gets the headline.
	 *
	 * @return the headline
	 */
	public String getHeadline() {
		return headline;
	}

	/**
	 * Sets the headline.
	 *
	 * @param headline the new headline
	 */
	public void setHeadline(String headline) {
		this.headline = headline;
	}

	/**
	 * Gets the content.
	 *
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * Sets the content.
	 *
	 * @param content the new content
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * Gets the review.
	 *
	 * @return the review
	 */
	public Review getReview() {
		return review;
	}

	/**
	 * Sets the review.
	 *
	 * @param review the new review
	 */
	public void setReview(Review review) {
		this.review = review;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Comment [headline=" + headline + ", content=" + content + ", review=" + review + "]";
	}
 
}