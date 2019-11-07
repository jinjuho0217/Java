/*
작성자 : 한승희
작성날짜 : 20191022 11:11
SPListService는 장바구니 구현을 목적으로 만든 클래스다.

select() : 장바구니에서 선택한 번호의 select값(boolean)을 true로 바꾼다.
allSelect() : 장바구니에서 모든 리스트의 select값을 true로 바꾼다.
cancel() : 장바구니에서 선택한 번호의 select값을 false로 바꾼다.
allCancel() : 장바구니에서 모든 리스트의 select값을 false로 바꾼다.
buy() :
delete() : 
 */
package service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import vo.RecentListVO;
import vo.RecentVO;
import vo.SPListVO;
import vo.UserVO;
import dao.BookDao;
import dao.BookDaoImpl;
import dao.RecentDao;
import dao.RecentDaoImpl;
import dao.RecentListDao;
import dao.RecentListDaoImpl;
import dao.SPListDao;
import dao.SPListDaoImpl;
import dao.UserDao;
import dao.UserDaoImpl;
import data.Session;

public class SPListServiceImpl implements SPListService{

	private static SPListServiceImpl instance;
	
	private SPListServiceImpl(){
		
	}
	
	public static SPListServiceImpl getInstance(){
		if(instance == null)
		{
			instance = new SPListServiceImpl();
		}
		return instance;
	}
	
	SPListDao spListDao = SPListDaoImpl.getInstance();		//인스턴스 객체를 생성하기위한 문장
															//getInstance()메서드를 사용하여 instance값이 null일 경우에만
															//새로 객체를 생성한다.
	BookDao bookDao = BookDaoImpl.getInstance();
	
	@Override
	public void select() {
		//장바구니 목록이 출력된 후 선택하는 메서드.
		//String을 사용하여 여러개를 선택할 수 있다.(구분은 ","로 한다.)
		//목록 출력은 Controller.java에서 구현한다.
		
		Scanner s = new Scanner(System.in);		//답변을 받을 스캐너 변수
		
		System.out.println("선택하실 목록의 번호들을 입력해주세요.(구분자: ',')> ");
		String selectNum[] = s.nextLine().split(",");	//받은 번호(String)을 ","로 나누어 String 배열 저장 //선택받을 번호 String타입 배열
		
		int number[] = new int[selectNum.length];			//String타입을 int로 변환하여 받을 변수 배열
		for(int i=0;i<number.length;i++)
		{
			number[i] = Integer.parseInt(selectNum[i]);		//String배열을 int배열로 변환하기위한 반복작업
		}
		
		selectMethod(number);
//		s.close();
	}
	
	@Override
	public void allSelect() {
		//장바구니 목록 전체를 선택하는 메서드.
		//이미 선택된 목록을 포함해서 모든 목록을 선택한다.
		//데이터베이스에서 장바구니 목록을 받아 length만큼 int number[]={1,2,3,...,length}를 만들어 준다.
		//그 후 selectMethod(number);를 호출한다.
		SPListDao splist = SPListDaoImpl.getInstance();
		int number[] = new int[splist.rtnSPListSize(Session.loginUser.getId())];
		
		for(int i=0;i<number.length;i++)
		{
			number[i] = i+1;
		}
		
		selectMethod(number);
	}
	
	public static void selectMethod(int[] number)
	{
		//선택 메서드를 구현한다.
		//일부 선택과 전체 선택의 메서드의 기능이 겹치기 때문에 만들었다.
		
		SPListDao spListDao = SPListDaoImpl.getInstance();	//getInstance() 추가
		
		for(int i=0;i<number.length;i++)	//선택한 목록의 select값을 true로 바꿔주기 위한 반복문
		{
			//장바구니 순서에서 number[i]값을 갖는 배열리스트의 select값에 true를 대입한다.
			SPListVO splist = spListDao.getSPList("ID", Session.loginUser.getId(), "NUMBER", number[i]);		//SPListnumber에서 number[i]와 일치하는 SPListVO를 불러온다. 
			splist.setSelect(true);
		}
	}

	@Override
	public void cancel() {
		//선택된 목록을 취소하는 메서드.
		//String을 사용하여 여러개를 선택해제 한다.
		Scanner s = new Scanner(System.in);		//답변을 받을 스캐너 변수
		
		System.out.println("선택하실 목록의 번호들을 입력해주세요.(구분자: ',')> ");
		String cancelNum[] = s.nextLine().split(",");	//받은 번호(String)을 ","로 나누어 String 배열 저장 //선택받을 번호 String타입 배열
		
		int number[] = new int[cancelNum.length];			//String타입을 int로 변환하여 받을 변수 배열
		for(int i=0;i<number.length;i++)
		{
			number[i] = Integer.parseInt(cancelNum[i]);		//String배열을 int배열로 변환하기위한 반복작업
		}
		
		cancelMethod(number);
//		s.close();
	}
	
	@Override
	public void allCancel() {
		//장바구니 목록 전체를 선택헤제하는 메서드.
		//모든 목록을 선택해제한다.
		SPListDao splist = SPListDaoImpl.getInstance();
		int number[] = new int[splist.rtnSPListSize(Session.loginUser.getId())];
		
		for(int i=0;i<number.length;i++)
		{
			number[i] = i+1;
		}
		
		cancelMethod(number);
	}
	
	public static void cancelMethod(int[] number)
	{
		//선택 취소 메서드를 구현한다.
		//일부 선택과 전체 선택 취소의 메서드의 기능이 겹치기 때문에 만들었다.
		
		SPListDao spListDao = SPListDaoImpl.getInstance();
		
		for(int i=0;i<number.length;i++)	//선택한 목록의 select값을 false로 바꿔주기 위한 반복문
		{
			//장바구니 순서에서 number[i]값을 갖는 배열리스트의 select값에 false를 대입한다.
			SPListVO splist = spListDao.getSPList("ID",Session.loginUser.getId(),"NUMBER", number[i]);		//SPListnumber에서 number[i]와 일치하는 SPListVO를 불러온다. 
			splist.setSelect(false);
		}
	}
	
	@Override
	public void buy() {
		//선택된 목록을 구매하는 메서드.
		//장바구니에서 목록이 삭제되며 삭제된 목록을 구매이력에 추가한다.
		SPListDao spListDao = SPListDaoImpl.getInstance();
		RecentDao recentDao = RecentDaoImpl.getInstance();
		RecentListDao recentListDao = RecentListDaoImpl.getInstance();
		UserDao userDao = UserDaoImpl.getInstance();
		
		RecentListVO recentList = new RecentListVO();	//새로운 RecentListVO를 생성
		
		Date now = new Date();	//지금 시간을 받아온다.
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");//데이터 포맷형식
		String time = sdf1.format(now);//데이터 포맷형식에 맞추어 값을 time에 저장
		
		int price=0;
		
		for(int i=0;i<spListDao.rtnSPListSize(Session.loginUser.getId());i++)
		{
			//SPListVO getSPList(String key, boolean select);
			SPListVO splist = spListDao.getSPList("ID", Session.loginUser.getId(),"SELECT", true);	//select값이 true이면 splist에 반환
									//TODO			//Id까지 파라미터로 넣어야 한다.
			//tb_recent와 tb_recentList에 저장하는 메서드.
			RecentVO recent = new RecentVO();		//새로운 RecentVO를 생성
			
			recent.setUserId(Session.loginUser.getId());
			recent.setRecentListNumber(recentListDao.matchedCnt(Session.loginUser.getId()));
							//ListNumber는 RecentListVO에서 number와 값이 같다.
			recent.setNumber(recentDao.matchedCnt(Session.loginUser.getId(), recentListDao.matchedCnt(Session.loginUser.getId())));
							//과정을 알아보기 쉽게하기위해서 그대로 넣었다.
			recent.setBookNumber(splist.getBookNumber());
			
			price += splist.getPrice();
			recent.setPrice(splist.getPrice());
			
			
			
			recent.setStock(splist.getStock());
			recentDao.addList(recent);
			
			//구매시 데이터베이스에 있는 책 재고가 감소한다.
			//만약 재고가 0이하이면 책의 재고가
			//소진되어 배송이 지연될 수 있다는 메세지를 띄운다.
			bookDao.changeStock(splist.getBookNumber(), splist.getStock());
			if(splist.getStock()<0)
			{
				System.out.println(bookDao.rtnBookTitle(splist.getBookNumber())
						+"의 재고가 소진되어 배송이 지연될 수 있습니다.");
			}
			
			spListDao.deleteList(splist);
		}
		//마일리지 적립 10%
		UserVO user = userDao.selectUser("ID", Session.loginUser.getId());
		user.setMileage(user.getMileage()+price/10);
		
		recentList.setUserId(Session.loginUser.getId());
		recentList.setNumber(recentListDao.matchedCnt(Session.loginUser.getId()));		//recentListDao에서 number를 반환
		recentList.setPrice(price);			//for문안에서 price를 더해 대입
		recentList.setDate(time);
		recentListDao.addList(recentList);
		
		//삭제 후 순서를 정렬하는 메서드 추가 필요
		for(int i=0;i<spListDao.rtnSPListSize(Session.loginUser.getId());i++)	//순서대로 정렬을 하기위해서 데이터베이스의 SPList사이즈만큼 반복
		{
			//i값을 파라미터로 넣어서 i번째의 SPListVO를 불러온다.
			//변수 splist에서 setNumber를 통해 i값을 넣어준다.
			//splist.setNumber(i+1);
			SPListVO splist = spListDao.getSPList(i);//TODO
			splist.setNumber(i+1);
		}
	}

	@Override
	public void delete() {
		//장바구니에서 선택한 목록이 삭제된다.
		
		SPListDao spListDao = SPListDaoImpl.getInstance();
		
		for(int i=0;i<spListDao.rtnSPListSize(Session.loginUser.getId());i++) //선택한 목록의 select값이 ture인 경우 목록을 삭제하기위해 number[]에 번호를 기록한다.
		{
			//SPListVO getSPList(String key, boolean select);
			SPListVO splist = spListDao.getSPList("ID", Session.loginUser.getId(),"SELECT", true);	//select값이 true이면 splist에 반환
											//TODO
			spListDao.deleteList(splist);
		}
		
		//삭제 후 순서를 정렬하는 메서드 추가 필요
		for(int i=0;i<spListDao.rtnSPListSize(Session.loginUser.getId());i++)	//순서대로 정렬을 하기위해서 데이터베이스의 SPList사이즈만큼 반복
		{
			//i값을 파라미터로 넣어서 i번째의 SPListVO를 불러온다.
			//변수 splist에서 setNumber를 통해 i값을 넣어준다.
			//splist.setNumber(i+1);
			SPListVO splist = spListDao.getSPList(i);	//TODO
			splist.setNumber(i+1);
		}
	}
	
	
	
	@Override
	public void viewSPList() {
		//SPList를 출력한다.
		System.out.println("==================================================");
		System.out.println("번호\t책 제목\t가격\t수량\t선택");
		for(int i=0;i<spListDao.rtnSPListSize(Session.loginUser.getId());i++)//조건문에 리스트 개수//userID를 대입하여 반환
		{
			SPListVO splist = spListDao.getSPList("ID", Session.loginUser.getId(), "NUMBER", i+1);
//			System.out.println(splist);
			
			System.out.print((i+1) + "\t");//번호	
			System.out.print(bookDao.rtnBookTitle(splist.getBookNumber())+"\t");	//책 제목
			System.out.print(splist.getPrice()+"\t");	//가격
			System.out.print(splist.getStock()+"\t");	//수량
			System.out.print(splist.isSelect()+"\n");	//선택
		}
		System.out.println("==================================================");
	}
	
}
