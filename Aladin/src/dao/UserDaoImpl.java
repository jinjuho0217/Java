
/*
데이터베이스에 접근하기 위한 메서드를 정의한 클래스
추상메서드를 override하여 사용하며, 메서드를 통해 data패키지에 접근한다.

*/
package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import data.Database;
import vo.UserVO;

public class UserDaoImpl implements UserDao {
	
	private static UserDaoImpl instance;
	
	private UserDaoImpl(){
		
	}
	
	public static UserDaoImpl getInstance(){
		
		if(instance == null)
		{
			instance = new UserDaoImpl();
		}
		return instance;
	}
	
	Database database = Database.getInstance();

	@Override
	public UserVO selectUser(String key, String value) {
		for(int i =0; i <database.tb_user.size(); i++){
			UserVO user = database.tb_user.get(i); // 데이터 베이스의 회원정보를 불러오기 위해 반복문 사용
			
			if(key.equals("ID")){
				if(user.getId().equals(value)){ //회원의 아이디 값을 구별하기 위한 조건문
					return user;
				}
			}
		}
		return null;
	}

	@Override
	public UserVO selectUser(HashMap<String,String> param) { // 회원 조회 - 아이디, 비밀번호, 이름 값 비교
		UserVO rtnUser = null;
		
		for(int i=0; i < database.tb_user.size(); i++){
			UserVO user = database.tb_user.get(i);
			boolean flag = true;
			
			Set<String> keys = param.keySet();
			for(String key : keys){
				String value = param.get(key);
				if(key.equals("ID")){
					if(!user.getId().equals(value)){
						flag = false;
					}
				}else if(key.equals("PASSWORD")){
					if(!user.getPassword().equals(value)){
						flag = false;
					}
				}else if(key.equals("NAME")){
					if(!user.getName().equals(value)){
						flag = false;
					}
				}
			}
			
			if(flag){
				rtnUser = user;
			}
		}
		return rtnUser;
	}

	@Override
	public void insertUser(UserVO user) {  //아이디(회원) 추가
		database.tb_user.add(user); 
		
	}

	@Override
	public ArrayList<UserVO> selectUserList() {	 //전체 회원 조회
		
		return database.tb_user;
	}

	@Override
	public void deleteUser(UserVO user) {
		//유저를 회원목록에서 삭제하는 기능.
		database.tb_user.remove(user);
	}

}
