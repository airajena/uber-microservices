package com.uber.review.adapters;

import com.uber.review.dtos.CreateReviewDto;
import com.uber.review.models.Review;

public interface CreateReviewDtoToReviewAdapter {

    public Review convertDto(CreateReviewDto createReviewDto);
}
