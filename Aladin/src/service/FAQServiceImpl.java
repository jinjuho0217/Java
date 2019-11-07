package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.FAQVO;
import dao.FAQDao;
import dao.FAQDaoImpl;
import data.Database;
import data.Session;

public class FAQServiceImpl implements FAQService {
	
	public static FAQServiceImpl instance;

	private FAQServiceImpl(){

	}
	public static FAQServiceImpl getInstance(){
		if(instance == null){
			instance = new FAQServiceImpl();
		}
		return instance;
	}
	
		FAQDao faqDao = FAQDaoImpl.getInstance();
		Database database = Database.getInstance();	
	
	
	@Override
	public void FAQList() {  // FAQ 게시글 목록
		
		
		ArrayList<FAQVO> FAQList = faqDao.selectSelectFAQ();
		
		
		System.out.println();
		System.out.println();
		System.out.println("===========================================");
		System.out.println("번호\t 작성자 \t 제목");
		System.out.println("===========================================");
		System.out.println();
		System.out.println();

		for(int i=0; i < FAQList.size(); i++){
			FAQVO number = FAQList.get(i);
			if(database.tb_faqList.get(i) ==null){
				System.out.println(number.getNumber()  +"\t" + number.getWriter() +  "\t" +number.getTitle());
			}else{
				System.out.println(number.getNumber() + "\t" + number.getWriter() + "\t" +number.getTitle());
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("===============================================");
		System.out.println();
	}

	@Override
	public void FAQContent() {  // FAQ내용 확인
		
		
		Scanner s = new Scanner(System.in);
		ArrayList<FAQVO> FAQList  = faqDao.selectSelectFAQ();
		int a;
		System.out.println();
		System.out.println("확인할 목록 번호 입력 → →");
		System.out.println();
		a = Integer.parseInt(s.nextLine());
		
		System.out.println("***************************************");
		System.out.println();
		for(int i=0; i<FAQList.size(); i++){
			FAQVO number = FAQList.get(i);
			
			if(i+1== a){
				System.out.println();
				System.out.println(number.getContents());
				System.out.println();
			}
		}
		
	}

	@Override
	public void FAQAdd() {  // FAQ 내용 추가
		FAQVO fvo = new FAQVO();
		
		Scanner s = new Scanner(System.in);
		
		
		try{
			System.out.println("=============[글쓰기]===============");
			System.out.println();
			System.out.println("글 제목 입력→ →");
			System.out.println();
			String title = s.nextLine();
			System.out.println();
			System.out.println("글 내용 입력→ →");
			System.out.println();
			String content = s.nextLine();
			System.out.println();
			
			ArrayList<FAQVO>faqlist  = new ArrayList<FAQVO>();
			if(database.tb_faqList.size()==0){
				fvo.setNumber(1);
				fvo.setWriter(Session.loginUser.getId());   
				fvo.setTitle(title);
				fvo.setContents(content);
				
				
				faqDao.insertFAQ(fvo);
				System.out.println();
				System.out.println("▷작성완료");
				System.out.println();
			}else{
				int size = database.tb_faqList.size() -1;
				int num = database.tb_faqList.get(size).getNumber();
				
				fvo.setNumber(num+1);
				fvo.setWriter(Session.loginUser.getId());   
				fvo.setTitle(title);
				fvo.setContents(content);
				
				faqDao.insertFAQ(fvo);
				System.out.println();
				System.out.println("▷작성완료");
				System.out.println();
			}
			FAQList();
		}catch(NumberFormatException ne){
			System.out.println();
			System.out.println("▷잘못입력했습니다. 다시 입력해주세요.");
			FAQAdd();
		}
		
	}
		
		
		
	

	@Override
	public void FAQDelete() {  // FAQ 글 삭제
		System.out.println();
		System.out.println();
		System.out.println("=================[글 삭제]=================");
		System.out.println();
		System.out.println();
		
		FAQList();
		
		Scanner s = new Scanner(System.in);
		System.out.println();
		System.out.println("삭제할 목록 번호 입력 → →");
		System.out.println();
		int fv = Integer.parseInt(s.nextLine());
		
		faqDao.deleteFAQ(fv-1);
		System.out.println();
		System.out.println(">수정완료");
		System.out.println();
		
		FAQList();
	}
	@Override
	public void FAQModify() {
		// TODO Auto-generated method stub
		
	}

	
}
