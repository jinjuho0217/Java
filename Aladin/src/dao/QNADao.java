package dao;

import java.util.ArrayList;

import vo.QNAVO;

public interface QNADao {

	QNAVO selectQNA(String key, int value); // 게시글 선택
	
	ArrayList<QNAVO> selectQNA(); // 전체 게시글 출력
	
	
	
	void insertQNA(QNAVO number); // QNA 추가
	
	void deleteQNA(int number); // QNA 삭제(관리자)
	
	void modifyNotice(QNAVO number); // QNA 수정(관리자)
	
	int rtnQnaSize();
	
	QNAVO selectQNA(int index);
}
