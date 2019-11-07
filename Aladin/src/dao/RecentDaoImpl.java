package dao;

import vo.RecentVO;
import data.Database;

public class RecentDaoImpl implements RecentDao{
	private static RecentDaoImpl instance;
	
	private RecentDaoImpl(){
		
	}
	
	public static RecentDaoImpl getInstance(){
		if(instance == null)
		{
			instance = new RecentDaoImpl();
		}
		return instance;
	}
	
	//인스턴스 객체를 생성하기위한 문장 getInstance()메서드를 사용하여 instance값이 null일 경우에만
	//새로 객체를 생성한다.
	
	Database database = Database.getInstance();

	@Override
	public void addList(RecentVO recent) {
		//tb_recent에 recent를 삽입한다.
		database.tb_recent.add(recent);
	}

	@Override
	public RecentVO getRecent(String key1, String value, String key2, int recentListNumber) {
		//key1에는 아이디, key2에는 recentListNumber값이 삽입된다. 리스트를 출력하기 위한 메서드
		for(int i=0;i<database.tb_recent.size();i++)
		{
			RecentVO recent = database.tb_recent.get(i);
			
			if(key1.equals("ID")&&key2.equals("RECENTLISTNUMBER"))
			{
				if(recent.getUserId().equals(value)&&recent.getRecentListNumber()==recentListNumber)
				{
					return recent;
				}
			}
		}
		
		return null;
	}
	
	@Override
	public RecentVO getRecent(String key1, String value, String key2,
			int recentListNumber, String key3, int number) {
		//아이디, recentListNumber와 number값이 파라미터로 들어오며
		//RecentVO가 반환된다.
		
		for(int i=0;i<database.tb_recent.size();i++)
		{
			RecentVO recent = database.tb_recent.get(i);
			
			if(key1.equals("ID")&&key2.equals("RECENTLISTNUMBER")
					&&key3.equals("NUMBER"))
			{
				if(recent.getUserId().equals(value)&&
						recent.getRecentListNumber()==recentListNumber
						&&recent.getNumber()==number)
				{
					return recent;
				}
			}
		}
		
		return null;
	}

	@Override
	public int matchedCnt(String userId, int recentListNumber) {
		int counter=0;
		
		for(int i=0;i<database.tb_recent.size();i++)
		{
			RecentVO recent = database.tb_recent.get(i);
			System.out.println("s");
			System.out.println(recent.getUserId());
			System.out.println(recent.getRecentListNumber());
			System.out.println(recentListNumber);
			if(recent.getUserId().equals(userId)&&recent.getRecentListNumber()==recentListNumber){
				counter++;
			}
		}
		
		return counter;
	}

}
