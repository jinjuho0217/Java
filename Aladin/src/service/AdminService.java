package service;

public interface AdminService {

	// 회원 정보 보기
	void userView();		//유저서비스에서 불러올것.
	
	// 전체 공지사항 보기
	void noticeView();
	
	// 전체 FAQ 보기
	void faqView(); // 메소드 생성 상의
	// 전체 QNA 보기
	void qnaView(); // 메소드 생성 상의
	// 전체 책 리스트 보기
	void booklistView(); // 메소드 생성 상의
	// 전체 리뷰 보기
	void reviewView(); // 메소드 생성 상의
} 
