package dao;

import vo.RecentVO;

public interface RecentDao {
	RecentVO getRecent(String key1, String value, String key2, int recentListNumber);
	//key1에는 아이디, key2에는 recentListNumber값이 삽입된다. 리스트를 출력하기 위한 메서드
	
	RecentVO getRecent(String key1, String value, String key2, int recentListNumber, String key3, int number);
	//아이디와 recentListNumber, number를 비교하여 RecentVO를 반환한다.
	
	void addList(RecentVO recent);
	
	int matchedCnt(String userId, int recentListNumber);
	//userId와 recentListNumber를 비교하여 사이즈 반환
}
