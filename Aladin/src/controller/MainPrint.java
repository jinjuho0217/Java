/*
controller 패키지에는 콘솔창을 실행할 MainPrint클래스와
제어를 담당하는 Controller클래스가 있다.
*/
package controller;

import java.util.Scanner;

import data.Session;
import service.AdminService;
import service.AdminServiceImpl;
import service.UserService;
import service.UserServiceImpl;

public class MainPrint{	//start()메서드를 사용하기 위해서 Controller클래스를 상속받았다.
	UserService userserviceImpl = UserServiceImpl.getInstance();
			
	public static void main(String[] args) {
		new MainPrint().begin();
	}
	
		void begin(){
		GuestController gc = new GuestController();
		AdminController ac = AdminController.getInstance();
		UserService us = UserServiceImpl.getInstance();
		AdminService as = AdminServiceImpl.getInstance();
		
		Scanner s = new Scanner(System.in);	//스캐너를 이용해 질문에 대한 답을 변수에 저장한다.
		

		try{
			int menu;
									
		do{
			
			System.out.println();
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ [알라딘 온라인 중고서점] ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");						//footer입력
			System.out.println("대전광역시 중구 중앙로 76 영민빌딩 2층");
			System.out.println("대표전화: 042-222-8202 팩스: 042-252-0678");
			System.out.println("5조 - 한승희, 이정은, 박재욱, 최효은, 진주호");
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println("1.로그인 / 2.회원가입 / 3.고객센터 / -1.종료");
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.print("메뉴에 해당하는 번호 입력.> ");							//문구 수정필요.
			System.out.println();
			
			menu = Integer.parseInt(s.nextLine());	//문자열로 입력받아 int형으로 변환할것. 스캐너에 .nextInt()가 있지만 버그가 있음.
			
			switch(menu){
				case 1:// 유저 로그인
					us.login();
					if(Session.loginUser != null && Session.loginUser.getGrade() == 1){
						gc.userMenu();
					}else if(Session.loginUser != null && Session.loginUser.getGrade() == 5){
						ac.adminMenu();
					}else{
						break;
					}
					break;
				case 2://회원가입
					us.join();
					break;
				case 3:
					//고객센터
					gc.Center();
					break;
				case -1 ://프로그램 종료
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;		
				}
			if(menu > 3){
				System.out.println("");
				System.out.println("▷ 잘못 입력하셨습니다. 다시 입력해주세요.");
				System.out.println("");
			}
			}while(menu != -1);
		}catch(NumberFormatException ne){
			System.out.println();
			System.out.println(" ");
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			System.out.println();
			System.out.println();
		}
	}

}

//MainPrint클래스 끝.