package dao;

import java.util.ArrayList;

import vo.BookVO;
import vo.SPListVO;

public interface BookDao {
	//리턴값으로 tb_bookList의 사이즈를 반환하는 메서드
	int rtnBookSize();
	
	//리턴값으로 책 제목을 반환하는 메서드. 파라미터로는 책 번호가 들어간다.
	//RecentListServiceImpl에서 사용.
	String rtnBookTitle(int bookNumber);
	
	ArrayList<BookVO> rtnBook();
	
	void insertbook(BookVO param);
	
	void changeStock(int bookNumber, int stock);

	void deleteList(BookVO BookVList);		//도서 삭제 리스트
}
