/*
데이터베이스에 접근하기 위한 메서드를 선언한 인터페이스
메서드를 선언만 해주었기 때문에 반드시 override해야 한다.
UserDaoImpl에서 override하여 사용한다.
*/
package dao;

import java.util.ArrayList;
import java.util.HashMap;

import vo.UserVO;

public interface UserDao {  //수정필요
	
	//단일 회원 조회
	UserVO selectUser(String key, String value);
		
	UserVO selectUser(HashMap<String,String> param);
		
	//회원 삽입
	void insertUser(UserVO user);
		
	//전체 회원 조회
	ArrayList<UserVO> selectUserList();
	
	void deleteUser(UserVO user);
}
