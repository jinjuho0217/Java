//작성자 한승희
package service;

import java.util.Scanner;

import vo.RecentListVO;
import vo.RecentVO;
import dao.BookDao;
import dao.BookDaoImpl;
import dao.RecentDao;
import dao.RecentDaoImpl;
import dao.RecentListDao;
import dao.RecentListDaoImpl;
import data.Session;

public class RecentListServiceImpl implements RecentListService{
	
	private static RecentListServiceImpl instance;
	
	private RecentListServiceImpl(){
		
	}
	
	public static RecentListServiceImpl getInstance(){
		if(instance == null)
		{
			instance = new RecentListServiceImpl();
		}
		return instance;
	}
	
	RecentListDao recentListDao = RecentListDaoImpl.getInstance();		//인스턴스 객체를 생성하기위한 문장
															//getInstance()메서드를 사용하여 instance값이 null일 경우에만
															//새로 객체를 생성한다.
	
	RecentDao recentDao = RecentDaoImpl.getInstance();
	BookDao bookDao = BookDaoImpl.getInstance();

	@Override
	public void inputRecentList(RecentListVO recentlist) {
		//recentlist를 spListDao의 메서드를 불러 데이터베이스에 추가한다.	//장바구니에서 물품을 구매할 때 사용한다.
		recentListDao.addList(recentlist);
	}

	@Override
	public void viewRecentList(String userId) {
		//userId를 받아서 사용자가 구매한 전체 리스트를 출력한다.
		System.out.println("=================================================");
		System.out.println("번호\t제목\t\t\t가격\t날짜");
		for(int i=recentListDao.matchedCnt(userId);i>1;i--)
		{	//i초기값 userId와 일치하는 목록의 개수
			RecentListVO recentList = recentListDao.getRecentList("ID", Session.loginUser.getId(), "NUMBER", i);
			String title="";
			//TODO recentDao에서 첫번째 책 번호를 받아와서 bookDao에서 책제목을 반환받고
			//리스트 개수를 받아 title에 대입. 책제목 외 n권
			RecentVO recent = recentDao.getRecent("ID", Session.loginUser.getId(), "RECENTLISTNUMBER", 1);
			int number = recentDao.matchedCnt(Session.loginUser.getId(),i);
			title += bookDao.rtnBookTitle(recent.getBookNumber());
			title += " 외 "+Integer.toString(number-1)+"권";//TODO
			
			System.out.print(i+"\t");	
			System.out.print(title+"\t");
			System.out.print(recentList.getPrice()+"\t");
			System.out.print(recentList.getDate()+"\n");
		}
		System.out.println("=================================================");
		
	}

	@Override
	public void detailViewList() {
		//recentService의 출력 메서드를 부른다.
		int number=0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("목록의 세부요소를 보려면 번호를 입력해주세요 > ");
		number = Integer.parseInt(s.nextLine());
		
		RecentServiceImpl recent = RecentServiceImpl.getInstance();
		
		recent.detailView(number);
		
		s.close();
	}
}
