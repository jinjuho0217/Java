package data;

import java.util.ArrayList;
import vo.UserVO;
public class Database {
	
	private static Database instance; 
	private Database(){}
	
	public static Database getInstance() {
		if(instance == null){
			
			instance = new Database();
		}
		return instance;
	}
	
	//유저를 저장할 테이블을 만들기
	public ArrayList<UserVO> tb_user = new ArrayList<UserVO>();
	{
		UserVO user = new UserVO();
		user.setId("admin");
		user.setPassword("admin");
		user.setName("관리자");
		
	}
}
