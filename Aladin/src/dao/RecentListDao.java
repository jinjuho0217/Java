package dao;

import vo.RecentListVO;
import vo.UserVO;

public interface RecentListDao {
	RecentListVO getRecentList(String key1, String value, String key2, int number);
					//key1에는 아이디, key2에는 number값이 삽입된다. 리스트를 출력하기 위한 메서드
	
	void addList(RecentListVO recentlist);	//데이터베이스의 tb_recentList에 recentlist를 추가한다.
	
	int matchedCnt(String userId);	//userId와 일치할때 cnt를
				//++하여 해당 유저에 대한 구매내역 사이즈를 반환
}
