package controller;

import java.util.Scanner;

import data.Session;
import service.BookFindSearchService;
import service.BookFindSearchServiceImpl;
import service.FAQService;
import service.FAQServiceImpl;
import service.NoticeService;
import service.NoticeServiceImpl;
import service.QNAService;
import service.QNAServiceImpl;
import service.RecentListService;
import service.RecentListServiceImpl;
import service.RecentService;
import service.RecentServiceImpl;
import service.ReviewService;
import service.ReviewServiceImpl;
import service.SPListService;
import service.SPListServiceImpl;
import service.SellRegisterService;
import service.SellRegisterServiceImpl;
import service.UserService;
import service.UserServiceImpl;

public class GuestController {
	
	
	//1.구매 - 도서조회, 검색//책 정보 열람, 장바구니에 넣기, 리뷰
			//2.판매등록
			//3.고객센터 - 공지사항 열람, FAQ 열람, QNA질문글 작성
			//4.MyPage - 구매이력, 장바구니, 회원정보수정
			//0.로그아웃
	//1.구매
	//1.도서조회 2.검색 0.이전화면
	
	//1.도서조회
		//1. 2. 3. 4. 5.
		//선택하면 해당 카테고리 출력
		//책 선택 후 //책 정보열람, 장바구니에 넣기, 리뷰 목록 선택화면 출력
	
	//2.검색
		//검색내용과 일치하는 책리스트를 출력
		//책 선택 후 //책 정보열람, 장바구니에 넣기, 리뷰 목록 선택화면 출력
	
		//리뷰 전체 출력
		//내용 볼 수 있도록 처리
	
	//2.판매등록
		//5개의 카테고리를 출력 후 유저에게 어떤 종류의 책인지 답변받을것.
		//책 제목 답변받기
		//책 저자 답변받기
		//출판사 답변받기
		//몇권을 팔것인지
		//희망 가격 답변받기
		//책 번호 BookDao에서 리스트 개수 반환받아 책번호에 넣을것. 	
	
	RecentService rtsv = RecentServiceImpl.getInstance(); // 구매 유저
	ReviewService rs = ReviewServiceImpl.getInstance(); // 리뷰
	
	public void userMenu(){
		Scanner s = new Scanner(System.in);
		
		try{
			int userMenu;

			do{
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[유저메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.도서 검색 후 구매");
				System.out.println("\t 2.도서 판매등록");
				System.out.println("\t 3.고객센터");	
				System.out.println("\t 4.마이페이지");
				System.out.println("\t 0.로그아웃");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.print("메뉴에 해당하는 번호 입력.> ");
				System.out.println();
				
				userMenu = Integer.parseInt(s.nextLine());
				
				switch(userMenu){
					case 1: //도서 구매
						BookBuy();
						break;
					case 2: //도서 판매등록
						SellRegisterService();
						break;
					case 3: //고객센터
						Center();
						break;
					case 4: //마이페이지
						MyPage();
						break;
					case 0: 		//로그아웃
					default:
						break;
				}
				if(userMenu > 4){
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}while(userMenu != 0);
		}catch(NumberFormatException ne){
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			System.out.println();
		}
		
//		s.close();
	}
	
	
	void BookBuy(){
		Scanner s = new Scanner(System.in);
		
		BookFindSearchService bfs = BookFindSearchServiceImpl.getInstance(); // 도서를 카테고리로 검색 + 키워드로 검색
		
		try{
			int BookBuy;

			do{
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[도서 구매]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.도서 카테고리 검색 후 구매");
				System.out.println("\t 2.도서 키워드 검색 후 구매");
				System.out.println("\t 0.뒤로 가기");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력.> ");
				
				BookBuy = Integer.parseInt(s.nextLine());
				
				switch(BookBuy){
					case 1: //도서 카테고리 검색 후 구매
						bfs.bookFind();
						break;
					case 2: //도서 키워드 검색 후 구매
						bfs.search();
						break;
					
					case 0: 		
					default:
						break;
				}
				if(BookBuy > 2){
					System.out.println("if 잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}while(BookBuy != 0);
		}catch(NumberFormatException ne){
			System.out.println("cahch 잘못입력하셨습니다. 다시 입력해주세요.");
			System.out.println();
		}
//		s.close();
	}
	
	//2.판매등록
			//5개의 카테고리를 출력 후 유저에게 어떤 종류의 책인지 답변받을것.
			//책 제목 답변받기
			//책 저자 답변받기
			//출판사 답변받기
			//몇권을 팔것인지
			//희망 가격 답변받기
	
	void SellRegisterService(){
		Scanner s = new Scanner(System.in);
		
		SellRegisterService srsv = SellRegisterServiceImpl.getInstance(); // 판매등록
		
		try{
			int SellRegisterService;

			do{
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[유저메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.판매할 도서 등록");
				System.out.println("\t 0.뒤로 가기");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력.> ");
				
				SellRegisterService = Integer.parseInt(s.nextLine());
				
				switch(SellRegisterService){
					case 1: //도서 판매 등록
						srsv.answer();
						break;
					
					case 0: 		
					default:
						break;
				}
				if(SellRegisterService > 1){
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}while(SellRegisterService != 0);
		}catch(NumberFormatException ne){
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			System.out.println();
		}
//		s.close();
	}
	//3.고객센터
	//1.공지사항 제목 출력
		//번호 선택하면 내용 출력
	//2.FAQ 제목 출력
		//번호 선택하면 내용 출력
	//3.QNA 제목 출력
		//번호 선택하면 내용 열람
		//글쓰기 기능
	
	void Center(){ 
		Scanner s = new Scanner(System.in);
		
		try{
			int Center;

			do{
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[유저메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.공지사항 보기");
				System.out.println("\t 2.FAQ 보기");
				System.out.println("\t 3.QNA 보기");
				System.out.println("\t 0.뒤로 가기");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력.> ");
				
				Center = Integer.parseInt(s.nextLine());
				
				switch(Center){
					case 1: //공지사항 선택
						NoticeCenter();
						break;
					case 2: //FAQ 선택
						FAQCenter();
						break;
					case 3: //QNA보기
						QNACenter();
						break;
					case 0: 		
					default:
						break;
				}
				if(Center > 3){
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}while(Center != 0);
		}catch(NumberFormatException ne){
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			System.out.println();
		}
//		s.close();
	}
	
	//공지사항 선택 메소드
	void NoticeCenter(){ 
		Scanner s = new Scanner(System.in);
		
		NoticeService ns = NoticeServiceImpl.getInstance(); // 공지사항 
		
		try{
			int NoticeCenter;

			do{
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[유저메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.전체 공지사항 보기");
				System.out.println("\t 2.공지사항 선택");
				System.out.println("\t 0.뒤로 가기");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력.> ");
				
				NoticeCenter = Integer.parseInt(s.nextLine());
				
				switch(NoticeCenter){
					case 1: //공지사항 보기
						ns.noticeList();
						break;
					case 2: //fAQ 보기
						ns.noticeContent();
						break;
					case 0: 		
					default:
						break;
				}
				if(NoticeCenter > 2){
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}while(NoticeCenter != 0);
		}catch(NumberFormatException ne){
			System.out.println("잘못입 력하셨습니다. 다시 입력해주세요.");
			System.out.println();
		}
//		s.close();
	}
	
	// FAQ 선택 메소드
	void FAQCenter(){ 
		Scanner s = new Scanner(System.in);
		
		FAQService faq = FAQServiceImpl.getInstance(); // FAQ
		
		try{
			int FAQCenter;

			do{
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[유저메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.FAQ 목록");
				System.out.println("\t 2.FAQ 보기");
				System.out.println("\t 0.뒤로 가기");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력.> ");
				
				FAQCenter = Integer.parseInt(s.nextLine());
				
				switch(FAQCenter){
					case 1: //전체 FAQ 보기
						faq.FAQList();
						break;
					case 2: //FAQ 내용보기
						faq.FAQContent();
						break;
					case 0: 		
					default:
						break;
				}
				if(FAQCenter > 2){
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}while(FAQCenter != 0);
		}catch(NumberFormatException ne){
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			System.out.println();
		}
//		s.close();
	}
	//QNA 목록 출력 및 선택 
	void QNACenter(){ 
		Scanner s = new Scanner(System.in);
		
		QNAService qna = QNAServiceImpl.getInstance(); // QNA
		
		try{
			int QNACenter;

			do{
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[유저메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.QNA 목록");
				System.out.println("\t 2.QNA 보기");
				System.out.println("\t 3.QNA 작성");
				System.out.println("\t 0.뒤로 가기");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력.> ");
				
				QNACenter = Integer.parseInt(s.nextLine());
				
				switch(QNACenter){
					case 1: //전체 QNA 보기
						qna.QNAList();
						break;
					case 2: //QNA 내용보기
						qna.QNAContent();
						break;
					// QNA 직접 입력하는 메소드 필요
					case 3: //QNA 내용보기
						qna.QNAAdd();
						break;
					case 0: 		
					default:
						break;
				}
				if(QNACenter > 3){
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}while(QNACenter != 0);
		}catch(NumberFormatException ne){
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			System.out.println();
		}
//		s.close();
	}
	
	//4.MyPage
		//1.구매이력
			//제목이 출력된 후 번호를 선택하면 구매이력 리스트가 출력됨
		//2.장바구니
			//1.선택 2.전부선택 3.선택취소 4.전부선택취소 5.삭제 6.구매
		//3.회원정보 수정 -- 메소드 구현해야함
			//비밀번호를 먼저 받아 인증
			//1.비밀번호 수정 2.주소 수정 3.전화번호 수정 4.이메일 수정
	
	void MyPage(){
		Scanner s = new Scanner(System.in);
		
		UserService userService = UserServiceImpl.getInstance();
		
		try{
			int MyPage;

			do{
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[유저메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.println("\t 1.구매이력 보기");
				System.out.println("\t 2.장바구니 보기");
				System.out.println("\t 3.회원정보 수정");
				System.out.println("\t 4.회원정보 보기");
				System.out.println("\t 0.뒤로 가기");
				System.out.println();
				System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
				System.out.println();
				System.out.print("메뉴에 해당하는 번호 입력.> ");
				
				MyPage = Integer.parseInt(s.nextLine());
				
				switch(MyPage){
					case 1: //구매이력
						BookRegist();
						break;
					case 2: //장바구니
						ViewSp();
						break;
					case 3: //회원정보수정
						MemberModify();
						break;
					case 4: //회원정보보기
						userService.userInfo();
						break;
					case 0: 		
					default:
						break;
				}
				if(MyPage > 4){
					System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
					System.out.println();
				}
			}while(MyPage != 0);
		}catch(NumberFormatException ne){
			System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			System.out.println();
		}
//		s.close();
	}
	
	//구매이력 보기
	void BookRegist(){
		Scanner s = new Scanner(System.in);
		
		RecentListService rlsv = RecentListServiceImpl.getInstance(); // 구매 리스트
		
		rlsv.viewRecentList(Session.loginUser.getId());
			
		rlsv.detailViewList();
		
//		s.close();
	}
	
	//장바구니 보기
	//1.선택 2.선택해제 3.전체선택 4.전체선택해제 5.구매 6.삭제 7. 장바구니 리스트 출력 0.이전화면
		void ViewSp(){
			Scanner s = new Scanner(System.in);
			
			SPListService spsv = SPListServiceImpl.getInstance(); // 장바구니
			
			try{
				int ViewSp;

				do{
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[유저메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.println("\t 1.목록 선택");
					System.out.println("\t 2.목록 선택 해제");
					System.out.println("\t 3.목록 전체 선택");
					System.out.println("\t 4.목록 전체 선택해제");
					System.out.println("\t 5.선택 목록 구매");
					System.out.println("\t 6.선택 목록 삭제");
					System.out.println("\t 7.장바구니 리스트 출력");
					System.out.println("\t 0.뒤로 가기");
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.print("메뉴에 해당하는 번호 입력.> ");
					
					ViewSp = Integer.parseInt(s.nextLine());
					
					switch(ViewSp){
						case 1: //장바구니 목록 번호 선택
							spsv.select();
							break;
						case 2: //선택취소
							spsv.cancel();
							break;
						case 3: //모두선택
							spsv.allSelect();
							break;
						case 4:	//모두 취소
							spsv.allCancel();
						case 5:
							spsv.buy();
						case 6:
							spsv.delete();
						case 7:
							spsv.viewSPList();						
						case 0: 		
						default:
							break;
					}
					if(ViewSp > 7){
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						System.out.println();
					}
				}while(ViewSp != 0);
			}catch(NumberFormatException ne){
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				System.out.println();
			}
//			s.close();
		}
		
		//회원정보수정
		void MemberModify()
		{
			UserService usv = UserServiceImpl.getInstance();
			usv.changeUserInfo();
		}
}
