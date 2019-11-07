package dao;

import java.util.ArrayList;
import java.util.HashMap;

import vo.UserVO;

public interface UserDao {
	//단일 회원 조회
	//유저를 리턴 받아서 확인해야됨
	// 파라미터가 2개여서 아이디면 아이디, 비밀번호면 비밀번호만 조회가능
	// 동시에는 안됨
	UserVO selectUser(String Key, String value);
	
	
	//  파라미터와 상관없이 조회가능함, 다 검색가능
	// hashmap 때문에
	 UserVO selectUser(HashMap<String, String> param);
	
	// 회원 삽입
	 void insertUser(UserVO user);
	 
	 //전체 회원을 조회
	 ArrayList<UserVO> selectUserList();
	 
	
	
}
