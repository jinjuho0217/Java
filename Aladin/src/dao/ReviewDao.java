package dao;

import java.util.ArrayList;

import vo.BookVO;
import vo.ReviewVO;

public interface ReviewDao {
	
	ArrayList<ReviewVO> searchReviewList();		//리뷰 데이터베이스를 불러오는 메서드
	
	void insertreview(ReviewVO book);		//리뷰 데이터베이스에 추가하는 메서드
	
	void deleteList(ReviewVO review);		//리뷰 데이터베이스 삭제하는 메서드
	
	double grade(int param);		//리뷰 평점 평균을 구하는 메서드
	
	String rtnBookTitle(int bookNumber);		//해당 Booknumber에 대한 책 제목 불러오는 메서드


}
