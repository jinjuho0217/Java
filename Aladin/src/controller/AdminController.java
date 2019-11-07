/*
controller 패키지에는 콘솔창을 실행할 MainPrint클래스와
제어를 담당하는 Controller클래스가 있다.
이 클래스는 Admin전용의 클래스이며 로그인할 때 관리자이면 AdminController가 실행된다.
*/
package controller;

import java.awt.List;
import java.util.Scanner;

import service.AdminService;
import service.AdminServiceImpl;
import service.BookFindSearchService;
import service.BookFindSearchServiceImpl;
import service.FAQService;
import service.FAQServiceImpl;
import service.ListModifyService;
import service.ListModifyServiceImpl;
import service.NoticeService;
import service.NoticeServiceImpl;
import service.QNAService;
import service.QNAServiceImpl;
import service.ReviewService;
import service.UserService;
import service.UserServiceImpl;

public class AdminController {
	//1.회원정보열람
	//2.공지사항 작성/수정/삭제
	//3.FAQ 추가/삭제
	//4.QNA 답변 권한/질문글 삭제
	//5.책 리스트 삭제
	//6.리뷰 글 삭제
	//0.로그아웃
	
	//위의 목록을 전부 출력하는 기능
	//1.회원정보열람 2.공지사항열람 3.FAQ열람 4.QNA열람 5.(전체)책 리스트 열람 6.전체 리뷰 열람
	
	//1.회원정보 열람 후
	//1.삭제 0.뒤로 가기
	
	//2.공지사항
	//1.글쓰기 2.수정 3.삭제 0.뒤로 가기
	
	//3.FAQ
	//1.글쓰기 2.수정 3.삭제 0.뒤로 가기
	
	//4.QNA
	//1.답변 글쓰기 2.수정 3.질문 글 삭제 4.답변 글 삭제 0.뒤로 가기
	
	//5.책 리스트 열람
	//1.삭제 0.뒤로 가기
	
	//6.리뷰
	//1.삭제 0.뒤로 가기
	
	//0.로그아웃
//	1.회원정보열람 2.공지사항열람 3.FAQ열람 4.QNA열람 5.(전체)책 리스트 열람 6.전체 리뷰 열람
	private static AdminController instance;
		
		private AdminController(){}
		
		public static AdminController getInstance(){
			if(instance == null){
				instance = new AdminController();
			}
			return instance;
		}
		
		
//		AdminService adminservice = AdminServiceImpl.getInstance();
//		NoticeService noticeservice = NoticeServiceImpl.getInstance();
	
		
		public void adminMenu(){
			Scanner s = new Scanner(System.in);
			
			try{
				int adminMenu;

				do{
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[관리자메뉴]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.println("\t 1.회원정보 열람");
					System.out.println("\t 2.공지사항 관리");
					System.out.println("\t 3.FAQ 관리");
					System.out.println("\t 4.QNA 관리");
					System.out.println("\t 5.도서 리스트 전체 보기");
					System.out.println("\t 6.전체 리뷰 보기");
					System.out.println("\t 0.로그아웃");
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.print("메뉴에 해당하는 번호 입력.> ");
					System.out.println();
					
					adminMenu = Integer.parseInt(s.nextLine());
					
					switch(adminMenu){
						case 1: //회원정보 열람
							Memberlist();
							break;
						case 2: //공지사항 관리
							NoticeManage();
							break;
						case 3: //FAQ 관리
							FaqManage();
							break;
						case 4: //QNA 관리
							QnaManage();
							break;
						case 5: //전체 책 리스트 보기
							BookManage();
							break;
						case 6: //전체 리뷰 보기
							ReviewManage();
							break;
						case 0: 		//로그아웃
						default:
							break;
					}
					if(adminMenu > 6){
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						System.out.println();
					}
				}while(adminMenu != 0);
			}catch(NumberFormatException ne){
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				System.out.println();
			}
		}
		
		// 회원 관리
		void Memberlist(){
			Scanner s = new Scanner(System.in);
			
			UserService userservice = UserServiceImpl.getInstance();
			
			try{
				int memberMenu;

				do{
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒[회원정보 열람]▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.println("\t 1.전체 회원정보 열람");
					System.out.println("\t 0.뒤로 가기");
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.print("메뉴에 해당하는 번호 입력.> ");
					
					memberMenu = Integer.parseInt(s.nextLine());
					
					switch(memberMenu){
						case 1: //회원정보 열람
							userservice.userList();
							break;
						case 0: 		
						default:
							break;
					}
					if(memberMenu > 1){
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						System.out.println();
					}
				}while(memberMenu != 0);
			}catch(NumberFormatException ne){
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				System.out.println();
			}
		}
		
		// 공지사항 관리
		void NoticeManage(){
			Scanner s = new Scanner(System.in);
			
			NoticeService noticeService = NoticeServiceImpl.getInstance();   
			
			try{
				int noticeManage;

				do{
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[공지사항 관리]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.println("\t 1.공지사항 목록");
					System.out.println("\t 2.공지사항 목록보기");
					System.out.println("\t 3.공지사항 추가(관리자)");
					System.out.println("\t 4.공지사항 수정(관리자)");
					System.out.println("\t 5.공지사항 삭제(관리자)");
					System.out.println("\t 0.뒤로 가기");
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.print("메뉴에 해당하는 번호 입력.> ");
					
					noticeManage = Integer.parseInt(s.nextLine());
					
					switch(noticeManage){
						case 1: 		//공지사항 목록
							noticeService.noticeList();
							break;
						case 2: 		//내용보기
							noticeService.noticeContent();
							break;
						case 3: 		//공지사항 쓰기
							noticeService.noticeAdd();
							break;
						case 4: 		//공지사항 수정
							noticeService.noticeModify();
							break;
						case 5: 		//공지사항 삭제
							noticeService.noticeDelete();
							break;
						case 0: 		
						default:
							break;
					}
					if(noticeManage > 5){
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						System.out.println();
					}
				}while(noticeManage != 0);
			}catch(NumberFormatException ne){
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				System.out.println();
			}
		}
		
		//FAQ 관리
//		1.글쓰기 2.수정 3.삭제 0.뒤로 가기
		void FaqManage(){
			Scanner s = new Scanner(System.in);
			
			FAQService faqService = FAQServiceImpl.getInstance();
			
			try{
				int faqManage;

				do{
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[FAQ 관리]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.println("\t 1.FAQ 게시글 목록");
					System.out.println("\t 2.FAQ 내용 확인");
					System.out.println("\t 3.FAQ 추가(관리자)");
					System.out.println("\t 4.FAQ 수정(관리자)");
					System.out.println("\t 5.FAQ 삭제(관리자)");
					System.out.println("\t 0. 뒤로 가기");
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.print("메뉴에 해당하는 번호 입력.> ");
					
					faqManage = Integer.parseInt(s.nextLine());
					
					switch(faqManage){
						case 1: //1.FAQ 게시글 목록
							faqService.FAQList();
							break;
						case 2: // 2.FAQ 내용 확인
							faqService.FAQContent();
							break;
						case 3: //3.FAQ 추가
							faqService.FAQAdd();
							break;
						case 4: //3.FAQ 수정
							faqService.FAQModify();
							break;
						case 5: //3.FAQ 삭제
							faqService.FAQDelete();
							break;
						case 0: 		
						default:
							break;
					}
					if(faqManage > 5){
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						System.out.println();
					}
				}while(faqManage != 0);
			}catch(NumberFormatException ne){
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				System.out.println();
			}
		}
//		1.답변 글쓰기 2.수정 3.질문 글 삭제 4.답변 글 삭제 0.뒤로 가기
		void QnaManage(){
			
			Scanner s = new Scanner(System.in);
			
			QNAService qnaService = QNAServiceImpl.getInstance();
			
			try{
				int qnaManage;

				do{
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[QNA 관리]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.println("\t 1.QNA 게시글 목록");
					System.out.println("\t 2.QNA 내용 확인");
					System.out.println("\t 3.QNA 내용 추가");
					System.out.println("\t 4.QNA 내용 삭제(관리자)");
					System.out.println("\t 5.QNA 답변 달기(관리자)");
					System.out.println("\t 0.뒤로 가기");
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.print("메뉴에 해당하는 번호 입력>");
					
					qnaManage = Integer.parseInt(s.nextLine());
					
					switch(qnaManage){
						case 1: //QNA 게시글 목록
							qnaService.QNAList();
							break;
						case 2: //QNA 내용 확인
							qnaService.QNAContent();
							break;
						case 3: //QNA 내용 추가
							qnaService.QNAAdd();
							break;
						case 4: //QNA 내용 삭제
							qnaService.QNADelete();
							break;
						case 5: //QNA 답변 달기
							qnaService.QNAModify();
							break;
						case 0: 		
						default:
							break;
					}
					if(qnaManage > 5){
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						System.out.println();
					}
				}while(qnaManage != 0);
			}catch(NumberFormatException ne){
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				System.out.println();
			}
		}
		//5.책 리스트 열람
		//1.삭제 0.뒤로 가기
		void BookManage(){
			Scanner s = new Scanner(System.in);
			
			BookFindSearchService bookfindsearchservice = BookFindSearchServiceImpl.getInstance();
			ListModifyService listModifyService = ListModifyServiceImpl.getInstance(); 
			
			try{
				int bookManage;

				do{
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[책 리스트 열람]▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.println("\t 1.도서 리스트 열람");
					System.out.println("\t 0.뒤로 가기");
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.print("메뉴에 해당하는 번호 입력>");
					
					bookManage = Integer.parseInt(s.nextLine());
					
					switch(bookManage){
						case 1: //책 리스트 열람
							listModifyService.bookListDelete();
							break;
						case 0: 		
						default:
							break;
					}
					if(bookManage > 1){
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						System.out.println();
					}
				}while(bookManage != 0);
			}catch(NumberFormatException ne){
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				System.out.println();
			}
		}
		
		void ReviewManage(){
			
			Scanner s = new Scanner(System.in);
			
			ListModifyService listModifyService = ListModifyServiceImpl.getInstance(); 
			
			try{
				int reviewManage;

				do{
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[리뷰 열람]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.println("\t 1.리뷰 열람");
					System.out.println("\t 0.뒤로 가기");
					System.out.println();
					System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
					System.out.println();
					System.out.print("메뉴에 해당하는 번호 입력>");
					
					reviewManage = Integer.parseInt(s.nextLine());
					
					switch(reviewManage){
						case 1: //리뷰 열람
							listModifyService.reviewListDelete();
							break;
						case 0: 		
						default:
							break;
					}
					if(reviewManage > 1){
						System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
						System.out.println();
					}
				}while(reviewManage != 0);
			}catch(NumberFormatException ne){
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
				System.out.println();
			}
		}
}
