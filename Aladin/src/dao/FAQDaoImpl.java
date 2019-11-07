package dao;

import java.util.ArrayList;

import data.Database;
import vo.FAQVO;

public class FAQDaoImpl implements FAQDao {

	public static FAQDaoImpl instance;

	private FAQDaoImpl(){

	}
	public static FAQDaoImpl getInstance(){
		if(instance == null){
			instance = new FAQDaoImpl();
		}
		return instance;
	}
	Database database = Database.getInstance();



	@Override
	public FAQVO selectFAQ(String key, int value) { // faq 글 선택
		for(int i =0; i<database.tb_faqList.size(); i++){
			FAQVO number = database.tb_faqList.get(i);
			if(number.equals(database.tb_faqList.get(i))){
				return number;
			}
		}
		return null;
	}
	
	@Override
	public ArrayList<FAQVO> selectSelectFAQ() { // faq 전체 리스트 출력
		return database.tb_faqList;
	}

	@Override
	public void insertFAQ(FAQVO number) { // faq 내용 추가
		database.tb_faqList.add(number);

	}

	@Override
	public void deleteFAQ(int number) { // faq 목록 삭제
		database.tb_faqList.remove(number);
	}
	
	
	
	/*@Override
	public void modifyFAQ(FAQVO number) { // faq 목록 수정
		for(int i=0; i< database.tb_faqList.size(); i++){
			if(database.tb_faqList.get(i).getNumber() == number.getNumber()){
				database.tb_faqList.remove(i);
			}
		}
		database.tb_faqList.add(number);
	}*/

}
