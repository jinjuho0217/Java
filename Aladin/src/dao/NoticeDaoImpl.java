package dao;

import java.util.ArrayList;

import data.Database;
import vo.NoticeVO;

public class NoticeDaoImpl implements NoticeDao {

	public static NoticeDaoImpl instance;
	
	private NoticeDaoImpl(){
		
	}
	public static NoticeDaoImpl getInstance(){
		if(instance == null){
			instance = new NoticeDaoImpl();
		}
		return instance;
	}
	Database database = Database.getInstance();
	
	
	@Override
	public NoticeVO selectNotice(String key, int value) {// 게시글 선택
		for(int i =0; i<database.tb_noticeList.size(); i++){
			NoticeVO number	=database.tb_noticeList.get(i);
			if(key.equals(database.tb_noticeList.get(i))){
				if(number.getNumber()==value){
					return number;
				}
			}
		}
		return null;
	}

	@Override
	public ArrayList<NoticeVO> selectNotice() {// 전체 게시글 출력
		
		return database.tb_noticeList;
	}

	@Override
	public void insertNotice(NoticeVO number) {// 공지사항 추가
		database.tb_noticeList.add(number);
	}

	@Override
	public void deleteNotice(int number) { //공지사항 삭제
		database.tb_noticeList.remove(number);
	}

	@Override
	public void modifyNotice(NoticeVO number) { // 공지사항 추가
		for(int i=0; i < database.tb_noticeList.size(); i++){
			if(database.tb_noticeList.get(i).getNumber()==number.getNumber()){
				database.tb_noticeList.remove(i);
			}
		}
		database.tb_noticeList.add(number);
	}
}
