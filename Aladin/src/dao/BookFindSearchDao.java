//도서 조회·서치 기능 Dao 추상메서드(인터페이스)

package dao;

import java.util.ArrayList;

import vo.BookVO;
import vo.SPListVO;
import vo.UserVO;

public interface BookFindSearchDao {
	
	ArrayList<BookVO> searchBookList();
	
	ArrayList<SPListVO> addSPList();
	
}
