/*
작성자 : 한승희
데이터베이스에서 장바구니의 데이터에 접근하기위한 기능을 담은 인터페이스
 */
package dao;

import java.util.HashMap;

import vo.SPListVO;

public interface SPListDao {
	//SPListVO method(메서드이름)(파라미터);
	SPListVO getSPList(String key, int value);		// getSPList "key"종류에 대해서 value와 값이 일치하면 splist반환
	
	SPListVO getSPList(HashMap<String, String> param);		//value값에 int형식넣으면 에러?
	
	SPListVO getSPList(String key, boolean select);		//"key"종류에 대해서 select값이 일치하면 splist반환
								//***주의 이것은 삭제를 위한 용도로 삭제하지 않으면 첫번째로 select가 true인 값(같은 값)을 계속 불러옴.
	SPListVO getSPList(int index);		//index번째의 SPListVO를 반환한다.
	
	SPListVO getSPList(String key1, String userId, String key2, int number);
	//선택메서드 구현용 getSPList
	
	SPListVO getSPList(String key1, String userId, String key2, boolean select);
	
	//장바구니 리스트 사이즈 반환
	int rtnSPListSize(String userId);
	
	//장바구니 리스트 추가
	void insertList(SPListVO splist);			//혹시 리스트 추가의 파라미터가 쓰기 불편하면 작성자에게 문의할것. 바꿔줄 수 있음.
	
	//장바구니 리스트 삭제
	void deleteList(SPListVO splist);
}
