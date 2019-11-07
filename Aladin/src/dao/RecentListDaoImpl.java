package dao;

import vo.RecentListVO;
import vo.RecentVO;
import vo.UserVO;
import data.Database;

public class RecentListDaoImpl implements RecentListDao {

	private static RecentListDaoImpl instance;
	
	private RecentListDaoImpl(){
		
	}
	
	public static RecentListDaoImpl getInstance(){
		if(instance == null)
		{
			instance = new RecentListDaoImpl();
		}
		return instance;
	}
	
	Database database = Database.getInstance();

	@Override
	public RecentListVO getRecentList(String key1, String value, String key2, int number) {
		//key1에는 아이디, key2에는 number가 파라미터로 들어옴
		//아이디와 number가 일치하는 RecentListVO를 반환한다.
		
		for(int i=0;i<database.tb_recentList.size();i++)
		{
			RecentListVO recentList = database.tb_recentList.get(i);
			
			if(key1.equals("ID")&&key2.equals("NUMBER"))
			{
				if(recentList.getUserId().equals(value)&&recentList.getNumber()==number)
				{
					return recentList;
				}
			}
		}
		
		return null;
	}

	@Override
	public void addList(RecentListVO recentlist) {
		//RecentListVO를 tb_recentList에 추가한다. 
		database.tb_recentList.add(recentlist);
	}

	@Override
	public int matchedCnt(String userId) {
		//userId와 일치할때 cnt를 ++하여 해당 유저에
		//대한 구매내역 사이즈를 반환
		int counter=0;
		
		for(int i=0;i<database.tb_recentList.size();i++)
		{
			RecentListVO recentList = database.tb_recentList.get(i);
			
			if(recentList.getUserId().equals(userId))
			{
				counter++;
			}
		}
		
		return counter;
	}
}
