package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import vo.UserVO;
import dao.UserDao;
import dao.UserDaoImpl;
import data.Session;

public class UserServiceImpl implements UserService {
	//인터페이스에서 add userService
	//싱글톤패턴으로
	private static UserServiceImpl instance; 
	private UserServiceImpl(){}
	
	public static UserServiceImpl getInstance() {
		if(instance == null){
			instance = new UserServiceImpl();
		}
		return instance;
	}
	
	UserDao userDao = UserDaoImpl.getInstance();
	// 객체를 받아오기위해서
	
	
	@Override
	public void join() {

		// 회원가입
		//사용자 정보 입력
		Scanner s = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = s.nextLine();
		System.out.print("비밀번호 : ");
		String password = s.nextLine();
		System.out.print("이름 : ");
		String name = s.nextLine();
		
		
		
		//아이디 중복 검사(아이디가 일치하는 회원검색, dao에 접근해서 확인)
		 UserVO user = new UserVO();
		 user.setId(id);
		 user.setPassword(password);
		 user.setName(name);
		
		
		 UserVO userCheck = userDao.selectUser("ID",user.getId());
		 //메서드를 계속 만들기보다는
		 
		 
		 
		
		// 사용자 정보 저장
		if(userCheck == null){
			userDao.insertUser(user);
			System.out.println(user.getName() + "님의 가입을 환영합니다.");
			
		}else{
			System.out.println("이미 존재하는 아이디 입니다.");
		}
		
	}

	@Override
	public void login() {
		// 로그인
		// 아이디, 비밀번호 입력
		Scanner s = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String id = s.nextLine();
		System.out.print("비밀번호 : ");
		String password = s.nextLine();
		
		// 아이디와 비밀번호가 일치하는 회원검색
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("ID", id);
		param.put("PASSWORD", password);
		
		UserVO user = userDao.selectUser(param);
		if(user ==null){
			System.out.println("아이디 혹은 비밀번호를 잘못 입력하셨습니다.");
			
		}else{
			Session.loginUser = user;
			System.out.println("로그인 성공");
			System.out.println(user.getName()+"님 성공하셨습니다.");
		}
		
		// 일치하는 사람이 있으면 로그인, 없으면 로그인 실패
		
		
		
		
	}

	@Override
	public void userList() {
		//회원 전체 목록 출력
		//회원 전체를 검색해서 
		//출력
		ArrayList<UserVO> userList = userDao.selectUserList();
		// 출력
	System.out.println("------------------------");
	System.out.println("번호\t아이디\t이름");
	System.out.println("------------------------");
	for(int i =0; i < userList.size(); i++){
		UserVO user = userList.get(i);
		System.out.println(i+1+"\t"+user.getId()+"\t"+user.getName());
	}
		System.out.println("------------------------");
	}

}
