package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import vo.NoticeVO;
import dao.NoticeDao;
import dao.NoticeDaoImpl;
import data.Database;
import data.Session;

public class NoticeServiceImpl implements NoticeService {
	SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");// 날짜
	private static NoticeServiceImpl instance;
	
	private NoticeServiceImpl(){
		
	}
	public static NoticeServiceImpl getInstance(){
		if(instance == null){
			instance = new NoticeServiceImpl();
		}
		return instance;
	}

	NoticeDao noticeDao = NoticeDaoImpl.getInstance();
	Database database = Database.getInstance();
	
	@Override
	public void noticeList() { // 공지사항 게시글 목록
		ArrayList<NoticeVO> noticeList = noticeDao.selectNotice();
		
		System.out.println();
		System.out.println();
		System.out.println("===========================================================");
		System.out.println("번호\t작성자\t제목\t\t날짜");
		System.out.println("===========================================================");
		System.out.println();
		
		for(int i=0; i < noticeList.size(); i++){
			NoticeVO number = noticeList.get(i);
			if(database.tb_noticeList.get(i).getDate()==null){ 
				System.out.println(i+1+"\t" + number.getWriter()+"\t"
						+number.getTitle()+"\t" + number.getDay()); // get.day(string) : 데이터 베이스에 불러올 날짜 값
			}else{
				System.out.println(i+1+"\t"+number.getWriter() + "\t"
						+ number.getTitle()+"\t"+"\t"
						+ ymd.format(number.getDate())); // get.date(today) : 오늘 날짜가 들어가는 함수
			}
		}
		System.out.println();
		System.out.println("=============================================================");
		System.out.println();
		
	}

	@Override
	public void noticeContent() { // 공지사항 내용 확인
		Scanner s = new Scanner(System.in);
		ArrayList<NoticeVO> noticeList = noticeDao.selectNotice();
		int a;
		System.out.println();
		System.out.println("확인하고 싶은 내용 번호입력 → →");
		a = Integer.parseInt(s.nextLine());
		
			System.out.println("***************************************");
		for(int i=0; i<noticeList.size(); i++){
			NoticeVO number = noticeList.get(i);
			
			if(i+1==a){
				
				System.out.println();
				System.out.println(number.getContents());
				System.out.println();
				
			}
		}
		
			System.out.println("***************************************");
	}

	@Override
	public void noticeAdd() { // 공지사항 내용 추가
		
		Date today = new Date();
	// time = ymd.format(time);
		
		NoticeVO nvo = new NoticeVO();
		
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
			
			ArrayList<NoticeVO> tb_noticeList = new ArrayList<NoticeVO>();
			if(database.tb_noticeList.size()==0){
				nvo.setNumber(1);
				nvo.setWriter(Session.loginUser.getId());  // 원래해야하는거 아래는 시험용
				//nvo.setWriter("진주호");
				nvo.setTitle(title);
				nvo.setContents(content);
				nvo.setDate(today);
				System.out.println(today);
				
				
				noticeDao.insertNotice(nvo);
				System.out.println();
				System.out.println("▷작성완료");
				System.out.println();
			}else{
				int size = database.tb_noticeList.size() -1;
				int num = database.tb_noticeList.get(size).getNumber();
				
				nvo.setNumber(num+1);
				nvo.setWriter(Session.loginUser.getId());  // 원래해야하는거 아래는 시험용
				//nvo.setWriter("진주호");
				nvo.setTitle(title);
				nvo.setContents(content);
				nvo.setDate(today);
				
				noticeDao.insertNotice(nvo);
				System.out.println();
				System.out.println("▷작성완료");
				System.out.println();
			}
			noticeList();
		}catch(NumberFormatException ne){
			System.out.println();
			System.out.println("▷잘못입력했습니다. 다시 입력해주세요.");
			noticeAdd();
		}
		
	}

	@Override
	public void noticeDelete() {// 공지사항 내용 삭제
		System.out.println();
		System.out.println("======================[글 삭제]========================");
		System.out.println();
		
		noticeList();
		
		Scanner s = new Scanner(System.in);
		System.out.println("삭제할 글 번호 입력 >>");
		System.out.println();
		int nv = Integer.parseInt(s.nextLine());
		
		noticeDao.deleteNotice(nv-1);
		System.out.println();
		System.out.println("▷ 수정 완료");
		System.out.println();
		
		noticeList();
	}

	@Override
	public void noticeModify() { // 공지사항 내용 수정
		Date today = new Date();
		NoticeVO nvo = new NoticeVO();
		System.out.println();
		System.out.println("=======================[글 수정]==========================");
		Scanner s = new Scanner(System.in);
		noticeList();
		
		try{
			System.out.println();
			System.out.println("글번호 입력→ →");
			int a = Integer.parseInt(s.nextLine());
			System.out.println();
			
			System.out.println("글제목 입력");
			String title = s.nextLine();
			System.out.println();
			
			System.out.println("내용입력→ →");
			String content = s.nextLine();
			System.out.println();
			
			nvo.setNumber(a);
			nvo.setWriter(Session.loginUser.getId());  // 원래해야하는거 아래는 시험용
//			nvo.setWriter("진주호");
			nvo.setTitle(title);
			nvo.setContents(content);
			nvo.setDate(today);
			
			noticeDao.modifyNotice(nvo);
			noticeList();
		
		
		}catch(NumberFormatException ne){
			System.out.println("▷잘못입력하셨습니다. 다시 입력해주세요.");
			System.out.println();
			noticeModify();
		}
		
	}

}
