/*
회원에 관련된 기능에 접근하기 위한 메서드를 선언한 인터페이스
메서드를 선언만 해주었기 때문에 반드시 override해야 한다.
UserServiceImpl에서 override하여 사용한다.
*/
package service;

public interface UserService {
	
	void join();	//회원가입
	
	void login();	//로그인
	
	void userList();	//회원 전체 목록 출력	//관리자만 실행할 수 있도록 설정
	
	void userInfo();	//개인 회원 정보 출력	//관리자만 실행할 수 있도록 설정		//시간남으면 할것.

	void logout(); //로그아웃
	
	void getOUT();	//회원 탈퇴 기능	//userId를 입력하여 탈퇴시킨다.
	
	void changeUserInfo();	//회원 정보 수정
}
