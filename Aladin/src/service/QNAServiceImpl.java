package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import vo.QNAVO;
import dao.QNADao;
import dao.QNADaoImpl;
import data.Session;

public class QNAServiceImpl implements QNAService {
	SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");// 날짜
	private static QNAServiceImpl instance;
	
	private QNAServiceImpl(){
		
	}
	public static QNAServiceImpl getInstance(){
		if(instance == null){
			instance = new QNAServiceImpl();
		}
		return instance;
	}

	QNADao qnaDao = QNADaoImpl.getInstance();
	
	@Override
	public void QNAList() { // QNA게시글 목록
		ArrayList<QNAVO> qnaList = qnaDao.selectQNA();
		System.out.println();
		System.out.println();
		System.out.println("===========================================================");
		System.out.println("번호\t작성자\t제목\t\t날짜");
		System.out.println("===========================================================");
		System.out.println();
		
		for(int i=0; i< qnaList.size(); i++){
			QNAVO number = qnaList.get(i);
			if(qnaDao.selectQNA(i).getDate() ==null){
				System.out.println(i+1+"\t" +number.getWriter()+"\t"+ 
			number.getTitle()+"\t"+number.getDay());
			}else{
				System.out.println(i+1+"\t"+number.getWriter() +"\t"+
						number.getTitle()+"\t"+"\t"+
						ymd.format(number.getDate()));
				
			}
		}
		System.out.println();
		System.out.println("==============================================");
		System.out.println();
	}

	@Override
	public void QNAContent() { // QNA 내용
		Scanner s = new Scanner(System.in);
		ArrayList<QNAVO> qnaList  = qnaDao.selectQNA();
		int a;
		System.out.println();
		System.out.println("확인할 번호입력 > >");
		a = Integer.parseInt(s.nextLine());
		
		System.out.println("-------------------------------------------");
		for(int i =0; i< qnaList.size(); i++){
			QNAVO number = qnaList.get(i);
			
			if(i+1==a){
				System.out.println();
				System.out.println(number.getqContents());
				System.out.println();
			}
			if(number.getaContents()!=null){
				System.out.println("[답변]"+number.getaContents());
			}else if(number.getaContents()==null){
				System.out.println();
			}
		}
		System.out.println("-------------------------------------------");
//		s.close();
	}

	@Override
	public void QNAAdd() {// QNA 추가
		
		Date today = new Date();
		
		QNAVO qvo = new QNAVO();
		
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
			
			if(qnaDao.rtnQnaSize()==0){
				qvo.setNumber(1);
				//qvo.setWriter(Session.loginUser.getId());   원래해야하는거 아래는 시험용
				qvo.setWriter(Session.loginUser.getId());
				qvo.setTitle(title);
				qvo.setqContents(content);
				//qvo.setDate(today);
				System.out.println(today);
				
				
				qnaDao.insertQNA(qvo);
				System.out.println();
				System.out.println("▷작성완료");
				System.out.println();
			}else{
				int size = qnaDao.rtnQnaSize() -1;
				int num = qnaDao.selectQNA(size).getNumber();
				
				qvo.setNumber(num+1);
				//qvo.setWriter(Session.loginUser.getId());   원래해야하는거 아래는 시험용
				qvo.setWriter(Session.loginUser.getId());
				qvo.setTitle(title);
				qvo.setqContents(content);
				qvo.setDay(ymd.format(today));
				
				qnaDao.insertQNA(qvo);
				System.out.println();
				System.out.println("▷작성완료");
				System.out.println();
			}
			QNAList();
			
		}catch(NumberFormatException ne){
			System.out.println();
			System.out.println("▷잘못입력했습니다. 다시 입력해주세요.");
			QNAAdd();
			
		}
//		s.close();
	}
		
	

	@Override
	public void QNADelete() {// QNA 삭제
		System.out.println();
		System.out.println("----------------[글삭제]-----------------");
		System.out.println();
		
		QNAList();
		
		Scanner s = new Scanner(System.in);
		System.out.println("삭제할 번호");
		System.out.println();
		int pv = Integer.parseInt(s.nextLine());
		
		qnaDao.deleteQNA(pv-1);
		System.out.println();
		System.out.println("> >삭제 완료");
		System.out.println();
		
		QNAList();
//		s.close();
	}

	@Override
	public void QNAModify() {// QNA 답변
		
		Scanner s = new Scanner(System.in);
		ArrayList<QNAVO> qnaList  = qnaDao.selectQNA();
		
		
		int a;
		String b;
		
		System.out.println();
		System.out.println("답변할 번호입력 > >");
		a = Integer.parseInt(s.nextLine());
		System.out.println("답변내용을 입력해주세요.");
		b = s.nextLine();
		
		
		for(int i=0; i<qnaList.size(); i++){
			QNAVO qna1 = qnaList.get(i);
			if(a==qna1.getNumber()){
				qna1.setaContents(b);
			}
		}
		
		
		System.out.println("-------------------------------------------");
		for(int i =0; i< qnaList.size(); i++){
			QNAVO number = qnaList.get(i);
			
			if(i+1==a){
				System.out.println();
				System.out.println(number.getqContents());
				
				System.out.println("--------------------------------");
				System.out.println();
				System.out.println();
				System.out.println("[답변]"+ number.getaContents());
				System.out.println();
			}
			
		}
		System.out.println("-------------------------------------------");
//		s.close();
	}
		
		
}

