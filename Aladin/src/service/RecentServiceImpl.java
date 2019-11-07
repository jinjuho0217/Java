package service;

import vo.RecentVO;
import dao.BookDao;
import dao.BookDaoImpl;
import dao.RecentDao;
import dao.RecentDaoImpl;
import data.Session;

public class RecentServiceImpl implements RecentService{

private static RecentServiceImpl instance;
	
	private RecentServiceImpl(){
		
	}
	
	public static RecentServiceImpl getInstance(){
		if(instance == null)
		{
			instance = new RecentServiceImpl();
		}
		return instance;
	}
	
	RecentDao recentDao = RecentDaoImpl.getInstance();		//인스턴스 객체를 생성하기위한 문장
															//getInstance()메서드를 사용하여 instance값이 null일 경우에만
															//새로 객체를 생성한다.
	BookDao bookDao = BookDaoImpl.getInstance();
	
	@Override
	public void inputRecent(RecentVO recent) {	//입력기능 장바구니구매기능
		recentDao.addList(recent);
	}

	@Override
	public void detailView(int recentListNumber) {
		//userId, recentListNumber, number를 파라미터로 넣어
		//RecentDao에서 RecentVO를 불러서 목록을 출력한다.
		
		System.out.println("=======================================================");
		System.out.println("번호\t책번호\t책제목\t\t\t수량\t가격");
		for(int i=0;i<recentDao.matchedCnt(Session.loginUser.getId(), recentListNumber);i++)//TODO 조건문 userId와 recentListNumber와 일치하는 목록 개수
		{
			RecentVO recent = recentDao.getRecent("ID", Session.loginUser.getId(), "RECENTLISTNUMBER", recentListNumber, "NUMBER", i+1);
			if(recent!=null)
			{
				System.out.print(i + "\t");// 번호
				System.out.print(recent.getBookNumber() + "\t");// 책번호
				System.out.print(bookDao.rtnBookTitle(recent.getBookNumber()) + "\t");// 책제목
				System.out.print(recent.getStock() + "\t");// 수량
				System.out.print(recent.getPrice()+"\n");//가격
			}
			else
			{
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		System.out.println("=======================================================");
	}

}
