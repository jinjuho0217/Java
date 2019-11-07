package controller;

import java.util.Scanner;

import service.UserService;
import service.UserServiceImpl;

public class Controller {
	
	UserService UserService = UserServiceImpl.getInstance();

	public static void main(String[] args) {
		/*
		 * 조 소개 > 주제 소개> 주세 선정 배경 > 프로그램 구조 > 시연
		 * 발표자1명, 도우미 1명
		 * 
		 * Controller : 메뉴선택
		 * Service : 메뉴 기능 수행
		 * 
		 * Dao : 데이터베이스 접속
		 * VO : 데이터를 담는 클래스
		 * 
		 * VO의 장점 : 무엇이 저장되어 있는지 쉽게 알 수 있다.
		 * HashMap의 장점 : 클래스를 많이 만들 필요가 없다.
		 * 
		 */

		new Controller().start();		



	}

	private void start() {
		Scanner s = new Scanner(System.in);
	
	
	int menu;
	do{
		System.out.println("------------메뉴--------------");
		System.out.println("1.회원가입");
		System.out.println("2.로그인");
		System.out.println("3.회원목록");
		System.out.println("0.프로그램 종료");
		System.out.println("-----------------");
		System.out.println("메뉴에 해당하는 번호입력>");

		menu = Integer.parseInt(s.nextLine()); //문자열로 입력받아 int로 변경해야 오류발생 줄일수있음
		//		s.nextInt(); // 버그가 있으므로 사용하지 말자

		switch (menu) {
		case 1: // 회원가입
			UserService.join();
			
			break;
		case 2: // 로그인
			UserService.login();
			
			break;
		case 3 : //회원목록	
			UserService.userList();
			
			break;
		case 0 : // 프로그램 종료	
			System.out.println("프로그램종료");
			
			break;
			
		}
	}while(menu != 0);

	}
}

//serviceimpl, dao는 여러곳에서 쓰기때문에 private(싱글톤)으로 만들기
// 서비스인터페이스로 만들거나 서비스클래스로 만들면된다.
/*
 * 데이터베이스에서 VO라는 객체에 담아서 이동
 * VO하기 싫으면 HashMap으로 하면됨
 * 데이터베이스에 접속하기 위해서는Dao클래스를 통해서 접속한다.
 * 
 */

