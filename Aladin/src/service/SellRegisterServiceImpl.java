//유저에게 답변받기

package service;

import java.util.ArrayList;
import java.util.Scanner;

import dao.BookDao;
import dao.BookDaoImpl;
import dao.ReviewDao;
import dao.ReviewDaoImpl;
import vo.BookVO;
import vo.UserVO;

public class SellRegisterServiceImpl implements SellRegisterService{
	
	
private static SellRegisterServiceImpl instance;
	
	private SellRegisterServiceImpl(){
		
	}
	
	public static SellRegisterServiceImpl getInstance(){
		
		if(instance == null)
		{
			instance = new SellRegisterServiceImpl();
		}
		return instance;
	}
	
	BookDao bookDao = BookDaoImpl.getInstance();


	@Override
	
	public void answer() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("▷ 도서 카테고리를 선택해주세요.");
		
		//카테고리 질문
		System.out.println("================================================");

		System.out.println("1. 과학 ");
		System.out.println("2. 소설 ");
		System.out.println("3. 인문 ");
		System.out.println("4. 경영 ");
		System.out.println("5. 자기계발 ");

		System.out.println("================================================");
		
		int anwser = Integer.parseInt(sc.nextLine()); //사용자 값을 입력 받기
		
		String category = null;
		
		switch(anwser){
			
			case 1 : 
				
				category = "과학";
				break;
				
			case 2 :
				
				category = "소설";
				break;
				
			case 3 :
				
				category = "인문";
				break;
				
			case 4 :
				
				category = "경영";
				break;
				
			case 5 :
				
				category = "자기계발";
				break;
				
			case 6 :
				
				category = "문학";
				break;		
		}
		
		System.out.print("▷ 책제목을 입력해주세요.> ");
		
		String bookname = sc.nextLine();       // 책 제목 문구를 받아온다.
			
		// 객체 생성 BookVO 타입의 객체를 생성한 후 변수를 선언해줌	
		
		BookVO book = new BookVO();
		
		book.setTitle("국내도서_" +category+ "_" +bookname);
		
		System.out.print("▷ 책 저자를 입력해주세요.> ");		
		String bookwriter = sc.nextLine();  // 책 저자를 받아온다.		
		book.setWriter(bookwriter);
		
		System.out.print("▷ 책 출판사를 입력해주세요.> ");	
		String bookpublisher = sc.nextLine(); // 책 출판사를 받아온다.		
		book.setPublisher(bookpublisher);
		
		System.out.print("▷ 수량을 입력해주세요.> ");
		int bookamount = Integer.parseInt(sc.nextLine()); // 판매하는 책 권수를 받아온다.
		book.setStock(bookamount);
		
		System.out.println("▷ 판매 가격을 입력해주세요.> ");
		int bookprice = Integer.parseInt(sc.nextLine()); // 판매하는 책 가격을 받아온다.
		book.setPrice(bookprice);
		


		ArrayList<BookVO> bookList = bookDao.rtnBook();
		
		int booksize = bookList.size()+1;  // BookDao에서 리스트 갯수를 반환하고 책을 추가하기 위해 +1 을 해줌 
		
		book.setBookNumber(booksize); // 책 number를 VO에 넘겨준다.
		
		bookDao.insertbook(book); // 책번호에 넣어줬음.
		
		System.out.println("================================================");
		System.out.println("▷ \'" + bookname + "\' 도서가 등록되었습니다.");
		System.out.println("================================================");
		
	}

	@Override
	public void deleteSellBook() {
		//책 리스트에서 
		
	}
}

	


