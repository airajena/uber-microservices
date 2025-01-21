package com.uber.review.services;

import com.uber.review.models.Driver;
import com.uber.review.models.Review;
import com.uber.review.repositories.BookingRepository;
import com.uber.review.repositories.DriverRepository;
import com.uber.review.repositories.ReviewRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;
    private final BookingRepository bookingRepository;
    private final DriverRepository driverRepository;

    public ReviewService(ReviewRepository reviewRepository,
                         BookingRepository bookingRepository,
                         DriverRepository driverRepository) {
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
        this.driverRepository = driverRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        System.out.println("*************");

        Optional<Driver> d = driverRepository.hqlFindByIdAndLicense(1L, "DL121212");
        System.out.println(d.get().getName());
    }
}
