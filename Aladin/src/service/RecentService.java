//작성자 한승희
//RecentListService와는 달리 좀 더 세세한 정보를 제공한다.
//책 제목 외 n권이 제목으로 되어있는 리스트를 선택했을 때
//구매한 책 리스트를 출력하는 기능과 장바구니에서 구매했을 때 
//tb_recent에 추가하는 기능을 담고있다.
package service;

import vo.RecentVO;

public interface RecentService {
	//기능 : 입력, 열람
	//입력은 userId, recentListNumber, number, bookNumber,
	//price, stock를 넣어야한다.
	
	//열람의 경우 recentListNumber와 userId를 받아서
	//number, bookNumber, price, stock을 불러온다.
	
	void inputRecent(RecentVO recent);	//입력기능 //장바구니 구매기능
	
	//열람기능 recentListNumber를 파라미터로 받아 
	//반복문을 사용하여 구매 내역을 조회한다.
	//설명이 필요한 사람은 작성자에게 문의할것.
	void detailView(int recentListNumber);
}
