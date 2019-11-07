package dao;

import java.util.ArrayList;

import data.Database;
import vo.BookVO;
import vo.FAQVO;
import vo.NoticeVO;
import vo.QNAVO;
import vo.ReviewVO;
import vo.UserVO;

public class AdminDaoImpl implements AdminDao{
	private static AdminDaoImpl instance;
	private AdminDaoImpl(){};
	
	public static AdminDaoImpl getInstance(){
		if(instance == null){
			instance = new AdminDaoImpl();
		}
		return instance;
	}
	Database database = Database.getInstance();
	
	
	
	@Override // 모든 유저 리스트 가져오기
	public ArrayList<UserVO> selectUserList() {
		return database.tb_user;
	}

	@Override // 모든 리뷰 리스트 가져오기
	public ArrayList<ReviewVO> selectReviewList() {
		return database.tb_reviewList;
	}

	@Override // 모든 FAQ 리스트 가져오기
	public ArrayList<FAQVO> selectFAQList() {
		return database.tb_faqList;
	}

	@Override // 모든 QNA 리스트 가져오기
	public ArrayList<QNAVO> selectQNAList() {
		return database.tb_qnaList;
	}

	@Override // 모든 공지사항 리스트 가져오기
	public ArrayList<NoticeVO> selectNoticeList() {
		return database.tb_noticeList;
	}


	@Override
	public ArrayList<BookVO> selectBookList() {
		return database.tb_bookList;
	}
	
}
