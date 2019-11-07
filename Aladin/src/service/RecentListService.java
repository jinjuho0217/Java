//작성자 한승희
package service;

import vo.RecentListVO;

public interface RecentListService {
	//기능 : 입력, 열람
	//입력은 number, userId, date, price를 넣어야 한다.
	//열람의 경우 date와 price를 불러온다. recentVO에서 책 제목 하나를 받고
	//몇권을 샀는지 받아서 "책제목 외 (몇)권"으로 제목을 출력할 것.
	
	void inputRecentList(RecentListVO recentlist);		//데이터베이스에 RecentListVO를 추가	//장바구니에서 구매시 활용
	
	void viewRecentList(String userId);
	
	void detailViewList();	//번호를 파라미터로 받아 세부적인 리스트를 출력
}
