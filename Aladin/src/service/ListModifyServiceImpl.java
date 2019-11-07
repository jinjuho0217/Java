package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.BookVO;
import dao.BookDao;
import dao.BookDaoImpl;
import dao.BookFindSearchDao;
import dao.BookFindSearchDaoImpl;

public class ListModifyServiceImpl implements ListModifyService {
	
	//싱글턴
	private static ListModifyServiceImpl instance;
	
	private ListModifyServiceImpl(){}
	
	public static ListModifyServiceImpl getInstance(){
		if(instance == null){
			instance = new ListModifyServiceImpl();
		}
		return instance;
	}
	
	
	int menu = 0;		//메뉴 입력(사용자 입력) 부분 전역변수
	

	@Override
	public void bookListDelete() {		//도서 리스트 추가, 삭제 부분
		
		BookFindSearchDao bookFindSearchDao = BookFindSearchDaoImpl.getInstance(); 
		SellRegisterService sellRegisterService = SellRegisterServiceImpl.getInstance(); 
		BookDao bookDao = BookDaoImpl.getInstance();  
		
		ArrayList<BookVO> bookList = bookFindSearchDao.searchBookList();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("==================================================");
		System.out.println("▷ 전체 도서 리스트");
		System.out.println();
		System.out.println("순번\t도서 제목");
		System.out.println();
		
		for(int i = 0; i < bookList.size(); i++){		//도서 리스트 전체 출력
			BookVO book1 = bookList.get(i);
				String bookName = book1.getTitle().substring(book1.getTitle().lastIndexOf('_') + 1);
				System.out.println(book1.getBookNumber() + "\t" + bookName);
		}
		
		int bookNumber = 0;
		
		do{
			
			System.out.println("==================================================");
			System.out.println("1.도서추가 / 2.도서삭제 / 0.돌아가기");
			System.out.println("==================================================");
			this.menu = Integer.parseInt(s.nextLine());
			
			switch(this.menu){	
			case 1: 
				sellRegisterService.answer();		//판매등록 호출 메서드
				break;	
			case 2:
				System.out.print("삭제할 책 번호를 선택해주세요.> ");
				
				bookNumber = Integer.parseInt(s.nextLine());
				
				for(int i = 0; i < bookList.size(); i++){		//해당 도서를 삭제하는 부분
					BookVO book1 = bookList.get(i);
					if(bookNumber == book1.getBookNumber()){
						bookDao.deleteList(book1);
					}
				}
				
				System.out.println("==================================================");
				System.out.println("삭제가 완료되었습니다.");
				System.out.println("==================================================");
				break;
			case 0:
			default:
				break;
			}
			
		}while(this.menu != 0);		

	}

	@Override
	public void reviewListDelete() {
		
		Scanner s = new Scanner(System.in);
		
		BookFindSearchDao bookFindSearchDao = BookFindSearchDaoImpl.getInstance(); 
		ReviewService reReviewService = ReviewServiceImpl.getInstance();
		ArrayList<BookVO> bookList = bookFindSearchDao.searchBookList();
		
		int bookNumber = 0;
		
		System.out.println("==================================================");
		System.out.println("▷ 전체 도서 리스트");
		System.out.println();
		System.out.println("순번\t도서 제목");
		System.out.println();
		
		for(int i = 0; i < bookList.size(); i++){		//도서 전체를 출력하는 부분
			BookVO book1 = bookList.get(i);
				String bookName = book1.getTitle().substring(book1.getTitle().lastIndexOf('_') + 1);
				bookNumber = book1.getBookNumber();
				System.out.println(book1.getBookNumber() + "\t" + bookName);
		}
		System.out.println("==================================================");
		System.out.println("▷ 리뷰를 확인할 책 번호를 입력해주세요.");
		
		this.menu = Integer.parseInt(s.nextLine());
		
		reReviewService.ReviewFind(this.menu);		//리뷰 출력과 겹치는 부분이 있어 메서드를 호출
		
		
		
	}


}
