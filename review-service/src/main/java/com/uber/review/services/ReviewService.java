package com.uber.review.services;

import com.uber.review.models.Review;
import com.uber.review.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("*************");
        Review r = Review.builder()
                .content("Amazing ride quality")
                .rating(4.0).build();
        System.out.println(r);
        reviewRepository.save(r);

        List<Review> reviews = reviewRepository.findAll();

        for(Review review : reviews) {
            System.out.println(r.getContent());
        }
        reviewRepository.deleteById(2L);
    }
}
