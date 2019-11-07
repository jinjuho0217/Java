//도서 조회·서치 기능 인터페이스 상속(implements)

package service;

import java.util.ArrayList;
import java.util.Scanner;




import controller.GuestController;
//import controller.GuestController;
import dao.BookFindSearchDao;
import dao.BookFindSearchDaoImpl;
import dao.SPListDao;
import dao.SPListDaoImpl;
import data.Session;
import vo.BookVO;
import vo.SPListVO;

public class BookFindSearchServiceImpl implements BookFindSearchService {
	
	
	String bookTitle = "";		//도서 제목 
	String bookWriter = "";		//도서 저자
	int bookNumber = 0;		//도서 인덱스 번호
	int menu = 0;			//메뉴 사용자 입력값
	int number = 0; 		//검색 도서 인덱스 번호
	int input = 0;			//메인화면으로 돌아가기 위한 변수

	
	// 생성자
	private static BookFindSearchServiceImpl instance;
	
	private BookFindSearchServiceImpl(){
	}
	public static BookFindSearchServiceImpl getInstance(){
		if(instance == null)
		{
			instance = new BookFindSearchServiceImpl();
		}
		return instance;
	}
	
	
	
	@Override
	public void bookFind() {		//도서 조회 기능
		
		Scanner s = new Scanner(System.in);
		
		this.input = 0;
		
		BookFindSearchDao bookFindSearchDao = BookFindSearchDaoImpl.getInstance(); 
		String category = "";
		
		do{
			
			if(this.input == 10){break;}
			this.input = 0;
			
			do{
				System.out.println("==================================================");
				System.out.println("1.과학 / 2.소설 / 3.인문 / 4.경영 / 5.자기계발 / 6.문학");
				System.out.println("==================================================");
				System.out.print("▷ 검색할 도서의 카테고리를 입력해주세요.> ");
				
				this.menu = Integer.parseInt(s.nextLine());
				
				
				switch(this.menu){			//사용자 값을 카테고리 값으로 변환
				case 1:
					category = "과학";
					break;
				case 2:
					category = "소설";
					break;
				case 3:
					category = "인문";
					break;
				case 4:
					category = "경영";
					break;
				case 5:
					category = "자기계발";
					break;
				case 6:
					category = "문학";
					break;
				}
			}while(!(0 < this.menu && this.menu < 7));
			
			ArrayList<BookVO> bookList = bookFindSearchDao.searchBookList();
			
			this.bookTitle = ""; 
			this.bookWriter = "";
			this.menu = 0;	
			this.number = 0;
			this.bookNumber = 0;
			
			System.out.println("==================================================");
			System.out.println("▷ 카테고리: " + category);
			System.out.println();
			System.out.println("순번\t도서 제목");
			
			for(int i = 0; i < bookList.size(); i++){
				BookVO book1 = bookList.get(i);
				String bookCategory = book1.getTitle().substring(book1.getTitle().indexOf("_") + 1, book1.getTitle().lastIndexOf('_'));
				if(category.equals(bookCategory)){
					String bookName = book1.getTitle().substring(book1.getTitle().lastIndexOf('_') + 1);
					this.number++;
					this.bookTitle += this.number + "솱" + bookName + "_"; 		//키워드에 해당하는 도서 제목을 전역변수로 저장하는 부분
					this.bookWriter += this.number + "솱" + book1.getWriter() + "_";
					System.out.println(this.number + "\t" + bookName);
				}
			}
			
			
			System.out.println();
			System.out.println("==================================================");
			System.out.println("(직접입력).도서 번호(상세) / 0.재검색 / -1.메인화면");
			System.out.println("==================================================");
			System.out.print("메뉴에 해당하는 번호 입력> ");
			this.menu = Integer.parseInt(s.nextLine());			//사용자한테 값 입력받는 부분
			System.out.println("==================================================");
			
			switch(this.menu)		//메뉴 선택에 따른 switch 문
			{
			case 0://재검색
				break;
			case -1://메인화면(로그인 이후)
				break;
			default:
				select();
				break;
			}
		}while(this.menu != -1);
		
	}
	

	@Override
	public void search(){		 //도서 검색 기능
		
		Scanner s = new Scanner(System.in);
		
		BookFindSearchDao bookFindSearchDao = BookFindSearchDaoImpl.getInstance(); 
		
		this.input = 0;
		
		do{
			
			if(this.input == 10){break;}
			this.input = 0;
			
			System.out.println("==================================================");
			System.out.println();
			System.out.print("▷ 검색할 도서의 제목 또는 키워드를 입력해주세요.> ");
			String title = s.nextLine();
			
			BookVO book = new BookVO();
			
			ArrayList<BookVO> bookList = bookFindSearchDao.searchBookList(); //Dao의 searchBookList를 호출, tb_bookList를 불러와 변수에 저장.
			
			String rtnBook = ""; 		//조건식을 위한 변수 선언
			this.bookTitle = "";		//도서 제목 
			this.bookWriter = "";		//도서 저자
			this.bookNumber = 0;
			this.menu = 0;			//메뉴 사용자 입력값
			this.number = 0; 
			
			System.out.println("==================================================");
			System.out.println("순번\t도서 제목\t\t저자");
			System.out.println();
			
			for(int i = 0; i < bookList.size(); i++){		//도서 제목을 검색하는 반복문
				BookVO book1 = bookList.get(i);
				String bookName = book1.getTitle().substring(book1.getTitle().lastIndexOf('_') + 1);
				if(bookName.contains(title)){
					rtnBook = bookName;
					if(rtnBook!=""){
						this.number++;
						this.bookTitle += this.number + "솱" + bookName + "_"; 		//키워드에 해당하는 도서 제목을 전역변수로 저장하는 부분
						this.bookWriter += this.number + "솱" + book1.getWriter() + "_";
						System.out.println(this.number + "\t" + bookName + "\t\t" + book1.getWriter());
					}
				}
			}
			
			SellRegisterService sellRegisterService = SellRegisterServiceImpl.getInstance();
			
			
			if(rtnBook == ""){ 		//해당 키워드의 도서를 찾지 못했을 경우
				do{
				
					System.out.println("▷ 해당 도서를 찾을 수 없습니다.");
					System.out.println();
					System.out.println("==================================================");
					System.out.println("0.예 / 1.아니오 ");
					System.out.println("==================================================");
					System.out.print("▷ 다시 입력하시겠습니까?> ");
					this.menu = Integer.parseInt(s.nextLine());
					if(this.menu == 0){
						break;
					}else if(this.menu == 1){
						this.input = 10;
						System.out.println("==================================================");
						break;
					}
					
					System.out.println();
					System.out.println("==================================================");
					System.out.println();
				}while(this.menu != 1);
			}else{				//해당 키워드의 도서를 찾은 경우
				System.out.println();
				System.out.println("\"" + title + "\"총 " + this.number + "개의 상품이 검색되었습니다.");
				System.out.println();
				System.out.println("==================================================");
				System.out.println("(직접입력).도서 번호(상세) / 0.재검색 / -1.메인화면");
				System.out.println("==================================================");
				System.out.print("메뉴에 해당하는 번호 입력> ");
				this.menu = Integer.parseInt(s.nextLine());			//사용자한테 값 입력받는 부분
				System.out.println("==================================================");
				System.out.println();
				
				switch(this.menu){		//메뉴 선택에 따른 switch 문
				case 0:		//재검색
					continue;
				case -1:	//메인화면
				default:
					select();
					break;
				}
			}
		}while(this.menu != -1);
	}
	
	@Override
	public void select() { 		//도서 검색 이후 선택지로 넘어가는 메서드. (구매/리뷰/이전화면)
		
		Scanner s = new Scanner(System.in);
		
		BookFindSearchDao bookFindSearchDao = BookFindSearchDaoImpl.getInstance(); 
		
		ArrayList<BookVO> bookList = bookFindSearchDao.searchBookList();
		
		String b = "";
		b = this.menu + "솱";
		
		
			
			//도서 제목 비교하는 부분
			if(this.number == 1 || this.menu == this.number){
				this.bookTitle = this.bookTitle.substring(this.bookTitle.indexOf(this.menu+"솱") + b.length(), this.bookTitle.length() - 1);
			}else{
				this.bookTitle = this.bookTitle.substring(this.bookTitle.indexOf(this.menu+"솱") + b.length(),
						this.bookTitle.indexOf(Integer.toString(this.menu + 1)) - 1);
			}
			
			//도서 저자 비교하는 부분(도서 제목 중복 대비)
			if(this.number == 1 || this.menu == this.number){
				this.bookWriter = this.bookWriter.substring(this.bookWriter.indexOf(this.menu+"솱") + b.length(), this.bookWriter.length() - 1);
			}else{
				this.bookWriter = this.bookWriter.substring(this.bookWriter.indexOf(this.menu+"솱") + b.length(),
						this.bookWriter.indexOf(Integer.toString(this.menu + 1)) - 1);
			}

			
			for(int i = 0; i < bookList.size(); i++){		//검색한 도서 제목에 대한 상세 정보 출력
				BookVO book1 = bookList.get(i);
				if(this.bookTitle.equals(book1.getTitle().substring(book1.getTitle().lastIndexOf('_') + 1)) && this.bookWriter.equals(book1.getWriter())){
					this.bookNumber = book1.getBookNumber();
					System.out.println();
					System.out.println("도서 제목: " + book1.getTitle().substring(book1.getTitle().lastIndexOf('_') + 1));
					System.out.println("지은이: " + book1.getWriter()); 
					System.out.println("출판사: " + book1.getPublisher()); 
					System.out.println("가격: " + book1.getPrice()+"원");
					System.out.println("재고: " + book1.getStock() + "개");
					System.out.println();
				}
			}
			
			do{
			
			System.out.println("==================================================");
			System.out.println("1.장바구니 담기 / 2.리뷰보기 / 0.이전화면 ");		//-1.메인화면(로그인 이후)  3.재검색  
			System.out.println("==================================================");
			System.out.print("메뉴에 해당하는 번호 입력.> ");
			
			this.menu = Integer.parseInt(s.nextLine());		//사용자 값 입력
			
			ReviewService reviewService = ReviewServiceImpl.getInstance(); 
			
			
			switch(this.menu)			//메뉴 선택에 따른 switch 문
			{
			case 1://장바구니 담기
				spListAdd(this.bookNumber);
				break;
			case 2://리뷰보기
				reviewService.ReviewFind(bookNumber);
				break;
			case 0://이전화면
				this.input = 10;
			default:
				break;
			}
		}while(this.menu != 0);
			
	}
	
	
	@Override
	public void spListAdd(int param) {
		
		Scanner s = new Scanner(System.in);
		
		BookFindSearchDao bookFindSearchDao = BookFindSearchDaoImpl.getInstance(); 
		
		SPListVO spList = new SPListVO();
		
		ArrayList<SPListVO> spList1 = bookFindSearchDao.addSPList();
		ArrayList<BookVO> bookList = bookFindSearchDao.searchBookList();
		
		int stock = 0;
		int inputStock = 0;
		
		
		for(int i = 0; i < bookList.size(); i++){
			BookVO book = bookList.get(i);
			if(param == book.getBookNumber()){
				stock = book.getStock();
				spList.setBookNumber(param);
				spList.setNumber(spList1.size() + 1);
				spList.setPrice(book.getPrice());
				break;
			}
		}
		
			
			do{
				System.out.println("==================================================");
				System.out.println("▷ 수량을 입력해주세요.");
				inputStock = Integer.parseInt(s.nextLine());
				if(inputStock > stock){
					System.out.println("현 재고: " + stock);
					System.out.println("▷ 재고 수량이 부족합니다.");
				}
				
			}while(inputStock > stock);
			
			
			spList.setStock(inputStock);
			spList.setUserId(Session.loginUser.getId());
			spList.setSelect(false);
			
			SPListDao spListDao = SPListDaoImpl.getInstance();
			spListDao.insertList(spList);
			
			System.out.println("==================================================");
			System.out.println("장바구니 추가가 완료되었습니다.");
			System.out.println("==================================================");
			
	}

}





