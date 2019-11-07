package dao;

import java.util.ArrayList;

import vo.FAQVO;


public interface FAQDao {
	
	FAQVO selectFAQ(String key, int value); // 게시글 선택
	
	ArrayList<FAQVO> selectSelectFAQ(); // 전체 게시글 출력
	
	void insertFAQ(FAQVO number); // FAQ 추가(관리자)
	
	void deleteFAQ(int number); // FAQ 삭제(관리자)
	
	/*void modifyFAQ(FAQVO number); // FAQ 수정(관리자)
	 */	
	
}
