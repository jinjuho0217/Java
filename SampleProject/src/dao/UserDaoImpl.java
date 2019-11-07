package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import data.Database;
import vo.UserVO;

public class UserDaoImpl implements UserDao {

	private static UserDaoImpl instance; 
	private UserDaoImpl(){}

	public static UserDaoImpl getInstance() {
		if(instance == null){
			instance = new UserDaoImpl();
		}
		return instance;
	}

	Database database = Database.getInstance();


	@Override
	public UserVO selectUser(String Key, String value) {
		for(int i =0; i< database.tb_user.size(); i++){
			UserVO user = database.tb_user.get(i);

			if(Key.equals("ID")){
				if(user.getId().equals(value)){
					return user;
					//아이디가 파라미터값과같으면 user를 리턴
				}
			}
		}
		return null;
	}

	@Override
	public void insertUser(UserVO user) {
		database.tb_user.add(user);

	}

	@Override
	public UserVO selectUser(HashMap<String, String> param) {
		UserVO rtnUser = null;

		//다수의 조건을 만족하는 사람을 찾는다
		// 조건에 만족하지 않는 사람을 걸러내면 됨
		for(int i=0; i<database.tb_user.size(); i++){
			UserVO user = database.tb_user.get(i);
			Set<String> keys = param.keySet();

			boolean flag =true;

			for(String Key : keys){
				String value = param.get(Key);
				if(Key.equals("ID")){
					if(!user.getId().equals(value)){
						flag = false;
					}
				}else if(Key.equals("PASSWORD")){
					if(!user.getPassword().equals(value)){
						flag = false;
					}
				}else if(Key.equals("NAME")){
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
	public ArrayList<UserVO> selectUserList() {
		return database.tb_user;
	}
}