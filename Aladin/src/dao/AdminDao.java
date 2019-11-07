package dao;

import java.util.ArrayList;

import vo.BookVO;
import vo.FAQVO;
import vo.NoticeVO;
import vo.QNAVO;
import vo.ReviewVO;
import vo.UserVO;

public interface AdminDao {
	//전체 회원 조회
		ArrayList<UserVO> selectUserList();
	//전체 리뷰 조회
		ArrayList<ReviewVO> selectReviewList();
	//전체 FAQ 조회
		ArrayList<FAQVO> selectFAQList();
	//전체 QNA 조회
		ArrayList<QNAVO> selectQNAList();
	//전체 공지사항 조회
		ArrayList<NoticeVO> selectNoticeList();
	//전체 책 조회
		ArrayList<BookVO> selectBookList();
}
