/*

로그인 및 회원가입 등의 기능을 정의한 클래스이다.
*/
package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import vo.UserVO;
import dao.UserDao;
import dao.UserDaoImpl;
import data.Session;

public class UserServiceImpl implements UserService{

	private static UserServiceImpl instance;
	
	private UserServiceImpl(){
		
	}
	
	public static UserServiceImpl getInstance(){
		
		if(instance == null)
		{
			instance = new UserServiceImpl();
		}
		return instance;
	}
	
	UserDao userDao = UserDaoImpl.getInstance();
	
	@Override
	public void join() {
		//회원가입을 할 수 있는 메서드
		//데이터베이스의 회원정보에 접근하여 id와 email을 입력한 id와 email을 비교하여 중복된
		//데이터가 있으면 회원가입 불가. 중복된 데이터가 없을 경우 회원 정보를 데이터베이스에 등록.
		//(정규식 패턴도 추가하여 패턴에 맞게 작성되지 않았다면 회원가입 반려)
		//회원가입에 필요한 정보는 이름, 비밀번호(비밀번호 확인도 넣어서 제대로 입력하였는지 확인),
		//email, 주소, 광고성 메세지 수신 여부 확인.
		
		String id; // id
		String password; // 비밀번호
		String name; // 이름
		String email; // 이메일
		String address; //주소
		String phonenumber; // 핸드폰 번호
		
		int grade; // 회원등급
		int mileage; // 마일리지
		int money; // 적립금
		
		//아이디 
		
		while(true){
			Scanner s = new Scanner(System.in);
			System.out.println();
			System.out.println("=====================[회원가입]======================");
			System.out.println();
			System.out.println("ID를 입력해주세요 :  ");
			
			// 아이디 설정
			
			boolean idc = false;
			
			id = s.nextLine();
			idc = i(id);
			
			if(idc){
				break;
			}else{
				System.out.println();
				System.out.println("ERROR - 패턴에 일치하지 않습니다. ");
				System.out.println("4 ~ 12 자리 영문자와 숫자만 허용합니다.");
				System.out.println();
				continue;
			}
			}
		
			//비밀번호 설정
		
			while (true) {
			Scanner s = new Scanner(System.in);
			System.out.println("PASSWORD를 입력해주세요 :  ");
			
			boolean pas = false;
			
			password = s.nextLine();
			pas = p(password);
			
			if(pas){ 
				break;
			} else {
				System.out.println();
				System.out.println("ERROR - 패턴에 일치하지 않습니다. ");
				System.out.println("6 ~ 11 자리의 영문자와 숫자만 허용합니다.");
				System.out.println();
				continue;
			}
			}
			
			// 이름 설정
			
			while (true) {
				Scanner s = new Scanner(System.in);
				System.out.println("이름을 입력해주세요 :  ");
				
				boolean na = false;
				
				name = s.nextLine();
				na = n(name);
				
				if(na){ 
					break;
				} else {
					System.out.println();
					System.out.println("ERROR - 패턴에 일치하지 않습니다. ");
					System.out.println("2 ~ 10 자리 한글만 입력이 가능합니다.");
					System.out.println();
					continue;
				}
				}
			
			// 이메일 설정
					
			while (true) {
				Scanner s = new Scanner(System.in);
				System.out.println("E-mail을 입력해주세요 :  ");
				
				boolean em = false;
				
				email = s.nextLine();
				em = e(email);
				
				if(em){ 
					break;
				} else {
					System.out.println();
					System.out.println("ERROR - 패턴에 일치하지 않습니다. ");
					System.out.println("Email 형식만 가능합니다.");
					System.out.println();
					continue;
				}				
				}
			
			//주소 설정
			
			while(true){
				Scanner s = new Scanner(System.in);
				System.out.println("주소를 입력해주세요 :  ");
				
				boolean ad = false;
				
				address = s.nextLine();
				ad = a(address);
				
				if(ad){
					break;
				}else{
					System.out.println();
					System.out.println("ERROR - 패턴에 일치하지 않습니다. ");
					System.out.println("한글과 숫자만 허용합니다.");
					System.out.println();
					continue;
				}
				}
			
			//핸드폰 번호 설정
			
			while(true){
				Scanner s = new Scanner(System.in);
				System.out.println("핸드폰 번호를 입력해주세요 :  ");
				
				boolean pho = false;
				
				phonenumber = s.nextLine();
				pho = ph(phonenumber);
				
				if(pho){
					break;
				}else{
					System.out.println();
					System.out.println("ERROR - 패턴에 일치하지 않습니다. ");
					System.out.println("010-1234-5678 형식으로 입력해주세요");
					System.out.println();
					continue;
				}
				}
			
			// 아이디 중복 검사
				
			UserVO user = new UserVO();
			
			user.setId(id);
			user.setPassword(password);
			user.setName(name);
			user.setEmail(email);
			user.setAddress(address);
			user.setGrade(1);
			
			UserVO userCheck = userDao.selectUser("ID", user.getId());
			
			// 사용자 정보 저장
			
			if(userCheck == null){
				userDao.insertUser(user);
				
				System.out.println(user.getName() + "님의 가입을 환영합니다.");
			}else{
				System.out.println("이미 존재하는 아이디입니다.");
			}
			
	}
	
	//아이디 정규식 검사

	private boolean i(String id) {
		Pattern p = Pattern.compile("^[a-zA-Z0-9]{4,12}");   // 영문자와 숫자만 허용 , 4 ~ 12 자리
		Matcher m = p.matcher(id);
		
		if (m.find()) {
			return true;
		} else {
		return false;
	}
	}
	
	// 비밀번호 정규식 검사
	
	private boolean p(String password) {
			
		Pattern p = Pattern.compile("[a-zA-Z0-9]{6,11}");   //영문자와 숫자만 허용, 6 ~ 11 자리
		Matcher m = p.matcher(password);
		
		if (m.find()) {
			return true;
		} else {
		return false;
		}
	}

	//이름 정규식 검사
	
	private boolean n(String name) {
		
		Pattern p = Pattern.compile("^[가-힣]{2,10}$");   // 한글만 허용 2 ~ 10 자리
		Matcher m = p.matcher(name);
		
		if (m.find()) {
			return true;
		} else {
		return false;
		}
	}
	
	//이메일 정규식 검사

	private boolean e(String email) {
		
		Pattern p = Pattern.compile("\\w{6,20}@[a-zA-Z]+\\.(?i)(com|net|org|([a-z]{2}\\.kr))$");   // Email 형식만 가능
		Matcher m = p.matcher(email);
		
		if (m.find()) {
			return true;
		} else {
		return false;
		}	
	}
	
	// 주소 정규식 검사
	
	private boolean a(String address) {
		
		Pattern p = Pattern.compile("^[가-힣0-9_ ]*$");   // 한글과 숫자만 허용합니다.
		Matcher m = p.matcher(address);
		
		if (m.find()) {
			return true;
		} else {
		return false;
		}	
	}
	
	// 핸드폰 번호 정규식 검사 
	
	private boolean ph(String phonenumber) {
		
		Pattern p = Pattern.compile("^(01[016789]{1}|02|0[3-9]{1}[0-9]{1})-?[0-9]{3,4}-?[0-9]{4}$");   // 010-1234-5678 형식
		Matcher m = p.matcher(phonenumber);
		
		if (m.find()) {
			return true;
		} else {
		return false;
		}
	}

	
	@Override
	public void login() {
		//로그인을 할 수 있는 메서드
		//입력한 id와 데이터베이스의 id를 비교 후 일치하는 id가 있으면, 데이터베이스의
		//회원정보에서 password와 입력한 password를 비교할 것.
		//일치하면 로그인이 성공했다는 메세지를 띄운 후 기능으로 넘어감.
		
		Scanner s = new Scanner(System.in);
		System.out.println();
		System.out.println("=====================[로그인]=====================");
		System.out.println();
		System.out.print("\t ID : "); // 아이디 입력
		String id = s.nextLine();
		System.out.print("\t PASSWORD : "); // 비밀번호 입력
		String password = s.nextLine();
		// 아이디와 비밀번호가 일치하는 회원 검색 
		HashMap<String, String> param = new HashMap<String, String>();
		param.put("ID", id);
		param.put("PASSWORD", password);
		System.out.println();
		System.out.println("==================================================");
		
		UserVO user = userDao.selectUser(param);
		
		// 있으면 로그인
		// 없으면 로그인 실패
		
		if(user == null){
			System.out.println("아이디 혹은 비밀번호를 잘못 입력하셨습니다.");
		}else{
			Session.loginUser = user;
			System.out.println("로그인 성공");
			System.out.println(" ♣ 로그인 성공 ♣");
			System.out.println(user.getName() +"님 환영합니다.");
			System.out.println("마일리지 : "+ user.getMileage());
			System.out.println("회원등급 : "+ user.getGrade());
		}
		
	}
	
	@Override //로그아웃
	public void logout() {
		Session.loginUser = null;
		System.out.println("로그아웃되셨습니다.");
	}
	
	

	@Override // 회원 전체 목록 출력
	public void userList() {
		//회원 전체 목록을 출력하는 메서드. 단, 관리자만 열람할 수 있도록 제한한다.
		//회원고유번호(가입한 순서, 0번은 관리자), 아이디, 비밀번호, 이름, email, 주소,핸드폰 번호 표시 
		
		ArrayList<UserVO> userList = userDao.selectUserList();
		
		// 출력
		
		
		System.out.println("==================================================");
		System.out.println("번호 \t ID \t 이름 \t 이메일 \t 주소 \t 전화번호");
		System.out.println();
		for(int i = 0; i < userList.size(); i++){
			UserVO user = userList.get(i);
			System.out.println(i + "\t" + user.getId() + "\t" + user.getPassword()
					+ "\t" + user.getName() + "\t" + user.getEmail() + "\t" +
					user.getAddress() + "\t" + user.getPhonenumber());
		}
			System.out.println("==================================================");
	}

		
	@Override
	public void userInfo() {	//나중에 시간남으면 할것.
		//개인 회원 정보 열람//관리자권한
		//개인 회원 열람시 열람한 목록(log파일)을 열람할 수 있도록 메서드 구성
		
		UserDao userDao = UserDaoImpl.getInstance();
		ArrayList<UserVO> userList = userDao.selectUserList();
		
		System.out.println("==================================================");
		System.out.println("번호 \t ID \t 이름 \t 이메일 \t 주소 \t 전화번호");
		System.out.println();
		
		for(int i = 0; i< userList.size(); i++){
			UserVO user1 = userList.get(i);
			if(user1.getId()==Session.loginUser.getId()){
				System.out.println(i + "\t" + user1.getId() + "\t" + user1.getPassword()
						+ "\t" + user1.getName() + "\t" + user1.getEmail() + "\t" +
						user1.getAddress() + "\t" + user1.getPhonenumber());
			}
		}
	}

	@Override
	public void getOUT() {
		//userId를 받아 탈퇴시킨다.
		String userId="";
		Scanner s = new Scanner(System.in);
		
		System.out.println("탈퇴시킬 회원의 아이디를 입력해주세요 > ");
		userId = s.nextLine();
		
		UserVO userList = userDao.selectUser("ID", userId);
		if(userList==null)
		{
			System.out.println("잘못입력하셨습니다.");
		}
		else
		{
			userDao.deleteUser(userList);
		}
//		s.close();
	}

	@Override
	public void changeUserInfo() {
		//회원의 정보를 수정한다.
		//sysout으로 비밀번호를 물어본 후 일치하면 다음의 기능으로 넘어간다.
		UserVO user = userDao.selectUser("ID", Session.loginUser.getId());
		UserDao userDao = UserDaoImpl.getInstance();
		ArrayList<UserVO> userList = userDao.selectUserList();
		Scanner s = new Scanner(System.in);
		String passConfirm="";
		String ans="";
		
		System.out.println("회원 정보를 수정합니다. 비밀번호를 입력해주세요 > ");
		String pass = s.nextLine();
		int menu = 0;
		
		if(Session.loginUser.getPassword().equals(pass)){//TODO
			System.out.println("==================================================");
			System.out.println(Session.loginUser.getId()+"님의 회원정보를 수정합니다.");
			
			do{
				System.out.println("==================================================");
				System.out.println("1.비밀번호 / 2.이메일 / 3.주소 / 4.핸드폰 번호 / 0.돌아가기");
				System.out.println("==================================================");
				System.out.println("▷ 수정할 정보를 선택해주세요.");
				
				menu = Integer.parseInt(s.nextLine());
				
				switch(menu){
				case 1: 
					System.out.println("▷ 수정할 비밀번호를 입력해주세요. > ");
					pass = s.nextLine();
					System.out.println("▷ 비밀번호확인을 위해 비밀번호를 다시 입력해주세요.> ");
					passConfirm = s.nextLine();
					//TODO
					if(pass.equals(passConfirm)){
						for(int i = 0; i < userList.size(); i++){
							UserVO user1 = userList.get(i);
							if(user1.getId().equals(Session.loginUser.getId())){
								user1.setPassword(pass);
							}
						}
						System.out.println("▷ 비밀번호가 변경되었습니다.");
					}else{
						System.out.println("▷ 잘못 입력하셨습니다.");
					}
					break;
				case 2: 
					System.out.println("▷ 수정할 이메일을 입력해주세요.> ");
					ans = s.nextLine();
						for(int i = 0; i < userList.size(); i++){
							UserVO user1 = userList.get(i);
							if(user1.getId().equals(Session.loginUser.getId())){
								user1.setEmail(ans);
							}
						}
						System.out.println("▷ 이메일이 변경되었습니다.");
					break;
				case 3:
					System.out.println("▷ 수정할 주소를 입력해주세요.> ");
					ans = s.nextLine();
						for(int i = 0; i < userList.size(); i++){
							UserVO user1 = userList.get(i);
							if(user1.getId().equals(Session.loginUser.getId())){
								user1.setAddress(ans);
							}
						}
						System.out.println("▷ 주소가 변경되었습니다.");
					break;
				case 4: 
					System.out.println("▷ 수정할 핸드폰 번호를 입력해주세요.> ");
					ans = s.nextLine();
						for(int i = 0; i < userList.size(); i++){
							UserVO user1 = userList.get(i);
							if(user1.getId().equals(Session.loginUser.getId())){
								user1.setPhonenumber(ans);
							}
						}
						System.out.println("▷ 핸드폰 번호가 변경되었습니다.");
					break;
				case 0: 
				}
				
			}while(menu != 0);
			
		}else{
			System.out.println("비밀번호가 틀렸습니다.");
		}
		
//		s.close();
	}
	

}
