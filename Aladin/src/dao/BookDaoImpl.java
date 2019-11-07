package dao;

import java.util.ArrayList;

import vo.BookVO;
import vo.SPListVO;
import data.Database;

public class BookDaoImpl implements BookDao{
	private static BookDaoImpl instance;
	
	private BookDaoImpl(){
		
	}
	
	public static BookDaoImpl getInstance(){
		if(instance == null)
		{
			instance = new BookDaoImpl();
		}
		return instance;
	}
	//인스턴스 객체를 생성하기위한 문장 getInstance()메서드를 사용하여 instance값이 null일 경우에만
	//새로 객체를 생성한다.
	Database database = Database.getInstance();
	
	@Override
	public int rtnBookSize() {
		//tb_bookList의 크기를 반환하는 메서드
		int bookSize=database.tb_bookList.size();
		
		return bookSize;
	}

	@Override
	public String rtnBookTitle(int bookNumber) {
		//책 번호와 일치하는 책 제목을 반환한다.
		String str = "";
		for(int i=0;i<database.tb_bookList.size();i++)
		{
			BookVO book = database.tb_bookList.get(i);
			
			if(book.getBookNumber()==bookNumber)
			{
				str = book.getTitle().substring(book.getTitle().lastIndexOf('_') + 1);
				break;
			}
		}
		
		return str;
	}

	@Override
	public ArrayList<BookVO> rtnBook(){
		//tb_bookList의 크기를 반환하는 메서드
		
		return database.tb_bookList;
	}

	@Override
	public void insertbook(BookVO param) {
		// 받아온 책 number를 데이터 베이스에 추가해준다.
		
		database.tb_bookList.add(param);
		
	}
	
	@Override
	public void deleteList(BookVO BookVList) {	//리스트 삭제 메서드
		database.tb_bookList.remove(BookVList);
	}

	@Override
	public void changeStock(int bookNumber, int stock) {
		//bookNumber와 일치하는 책 번호를 가진 책의 재고가
		//stock만큼 감소한다.
		
		for(int i=0;i<database.tb_bookList.size();i++)
		{
			BookVO book = database.tb_bookList.get(i);
			
			if(book.getBookNumber()==bookNumber)
			{
				book.setStock(book.getStock() - stock);
				break;
			}
		}
	}

}
