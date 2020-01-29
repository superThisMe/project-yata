package com.yata.service;

import java.util.List;

import com.yata.vo.ReviewVO;

public interface ReviewService {
	
	void writeReview(ReviewVO review);

	List<ReviewVO> findReviewByUser_num(int user_num);

	int countAllReviews();

}
