//도서 조회·서치 기능 Dao 인터페이스 상속(implements)

package dao;

import java.util.ArrayList;

import data.Database;
import vo.BookVO;
import vo.SPListVO;
import vo.UserVO;

public class BookFindSearchDaoImpl implements BookFindSearchDao {

	
	private static BookFindSearchDaoImpl instance;
	
	private BookFindSearchDaoImpl(){}
	
	public static BookFindSearchDaoImpl getInstance(){
		if(instance == null){
			instance = new BookFindSearchDaoImpl();
		}
		return instance;
	} //SearchDaoImpl의 싱글턴 타입의 생성자 생성
	
	
	Database database = Database.getInstance();

	
	@Override
	public ArrayList<BookVO> searchBookList() {		//tb_bookList를 불러올 메서드
		return database.tb_bookList;
	}

	@Override
	public ArrayList<SPListVO> addSPList() {		//tb_bookList에 저장할 메서드
		return database.tb_spList;
	}

}
