package dao;

import java.util.ArrayList;

import vo.NoticeVO;

public interface NoticeDao {
	
	NoticeVO selectNotice(String key, int value); // 게시글 선택
	
	ArrayList<NoticeVO> selectNotice(); // 전체 게시글 출력
	
	void insertNotice(NoticeVO number); // 공지사항 추가(관리자)
	
	void deleteNotice(int number); // 공지사항 삭제(관리자)
	
	void modifyNotice(NoticeVO number); // 공지사항 수정(관리자)
	
	
}

