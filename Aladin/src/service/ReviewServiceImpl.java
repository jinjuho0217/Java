package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import vo.BookVO;
import vo.ReviewVO;
import dao.BookFindSearchDao;
import dao.BookFindSearchDaoImpl;
import dao.ReviewDao;
import dao.ReviewDaoImpl;
import data.Session;

public class ReviewServiceImpl implements ReviewService {
	
	ReviewDao reviewDao = ReviewDaoImpl.getInstance(); 
	
	String writer = "";		//리뷰 수정 문구를 묻기 위한 변수
	int menu = 0;		//메뉴(사용자 입력) 변수
	double grade1 = 0.0;	//평점 변수
	String gradeStar = "";	//평범 출력하는 ☆ 부분
	int reviewNumber = 0;	
	
	
	// 생성자
	private static ReviewServiceImpl instance;
	
	private ReviewServiceImpl(){
	}
	public static ReviewServiceImpl getInstance(){
		if(instance == null)
		{
			instance = new ReviewServiceImpl();
		}
		return instance;
	}
	
	

	@Override
	public void ReviewFind(int param) {		//리뷰 보기
		
		Scanner s = new Scanner(System.in);
		
		BookVO book = new BookVO();
		ReviewVO review = new ReviewVO();
		ReviewDao reviewDao = ReviewDaoImpl.getInstance(); 
		ArrayList<ReviewVO> reviewList = reviewDao.searchReviewList();
		
		String bookName = reviewDao.rtnBookTitle(param);		//도서 제목 불러오는 메서드
		
		System.out.println("==================================================");
		System.out.println();
		System.out.println("▷ 책: " + bookName);
		System.out.println();
		
		double grade = (double)reviewDao.grade(param);
		this.grade1 = grade;
		this.gradeStar = "";
		
		for(int i = 1; i <= 5; i++){		//전체 평점 부분 (추후 가능하면 수정)
			grade = grade - 1;
			if(grade >= 0){
				this.gradeStar += "★";
			}else{
				this.gradeStar += "☆";
			}
		}
		
		if(0 < this.grade1 && this.grade1 < 6){
			System.out.println("전체 평점: " + this.gradeStar + "(" + this.grade1 + ")");
			System.out.println();
		}
		
		String str = "";		//해당 리뷰가 없음을 표시하는 변수
		int number = 0;
		int reviewNumber = 0;
		
		for(int i = reviewList.size() - 1; i >= 0; i--){		//리뷰 최근 것부터 불러오는 반복문
			ReviewVO review1 = reviewList.get(i);
			if(param == review1.getBookNumber()){
				number++;
				if(Session.loginUser.getId().equals("admin")){
					System.out.println("No." + review1.getReviewNumber());
				}else{
					System.out.println("No." + number);
				}
				System.out.println("작성자: " + review1.getWriter());
				System.out.println("내용: " + review1.getContents());
				System.out.println("평점: " + review1.getRating());
				System.out.println("날짜: " + review1.getDate());
				System.out.println("--------------------");
				str = " ";
			}
		}
		if(str == ""){		//해당 리뷰가 없을 때의 문구를 표시하는 부분
			System.out.println("- 해당 도서의 리뷰가 없습니다.");
			System.out.println();
		}
		
		do{
					
		System.out.println("==================================================");
		if(Session.loginUser.getId().equals("admin")){
			System.out.println("1.리뷰작성 / 0.이전화면 / 999.리뷰삭제");
		}else{
			System.out.println("1.리뷰작성 / 0.이전화면");
		}
		System.out.println("==================================================");
		System.out.print("메뉴에 해당하는 번호 입력> ");
		this.menu = Integer.parseInt(s.nextLine());
		
		switch(this.menu){
		case 1: 		//리뷰작성
			ReviewModifyWrite(param);
			break;
		case 999:
			ReviewModifyWrite(param);
		case 0:			//돌아가기
		default:
			break;
		}
		break;
		}while(this.menu != 0);
		

	}
	
	
	@Override
	public void ReviewModifyWrite(int param) {		//리뷰 작성
		
		
		Scanner s = new Scanner(System.in);
		SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");		//오늘 일자를 불러오기 위함
		Date today = new Date();										//오늘 일자를 불러오기 위함

		ReviewVO review = new ReviewVO();
		ReviewDao reviewDao = ReviewDaoImpl.getInstance(); 
		ArrayList<ReviewVO> reviewList = reviewDao.searchReviewList();
		
		int menu = 0;
		
		if(this.writer.equals(Session.loginUser.getId())){		//수정 내용 문구가 뜨도록 만든 부분
			System.out.println("▷ 입력하신 내용을 수정하시겠습니까?> ");
			System.out.println("==================================================");
			System.out.println("0.예 / 1.아니오");
			System.out.println("==================================================");
			System.out.print("▷ 원하는 메뉴 선택.> ");
			menu = Integer.parseInt(s.nextLine());
			
			switch(menu){//사용자 정보를 세션과 다르게 바꿔주는 부분
			case 0:
				
				System.out.println("==================================================");
				System.out.println();
				System.out.print("▷ 리뷰 내용을 작성해주세요.> ");
				
				String reviewContents = s.nextLine();
				int reviewGrade = 0;
				
				do{		//평점 1~5를 입력하지 않았을 경우 시행되는 반복문
					System.out.print("▷ 평점을 입력해주세요.(1 ~ 5)> ");
					reviewGrade = Integer.parseInt(s.nextLine());
					double reviewGrade2 = reviewGrade; 
				}while(!(reviewGrade > 0 && reviewGrade < 6));
				
				System.out.println(this.reviewNumber);
				
				for(int i = 0; i < reviewList.size(); i++){
					ReviewVO review1 = reviewList.get(i);
					if(review1.getReviewNumber() == this.reviewNumber){
						review1.setWriter(Session.loginUser.getId());
						review1.setBookNumber(param);
						review1.setReviewNumber(review.getReviewNumber());
						review1.setContents(reviewContents);
						review1.setRating(reviewGrade);
						review1.setDate(ymd.format(today));
					}
				}
				
				break;
			case 1:
				break;
			}
			
		}else if(Session.loginUser.getId().equals("admin")){		//관리자아이디로 로그인 했을 때 리뷰를 삭제하는 곳
			
			if(0 < this.grade1 && this.grade1 < 6){
				System.out.println("==================================================");
				System.out.println("▷ 삭제하실 리뷰 번호를 선택해주세요.> ");
				menu = Integer.parseInt(s.nextLine());
				
				System.out.println();
				
				for(int i = 0; i < reviewList.size(); i++){		//도서 제목을 검색하는 반복문
					ReviewVO review1 = reviewList.get(i);
					if(menu == review1.getReviewNumber()){
						reviewDao.deleteList(review1);
					}
				}
				System.out.println("==================================================");
				System.out.println("▷ 삭제가 완료되었습니다.");
				System.out.println("==================================================");
			}else{
				System.out.println("▷ 삭제할 리뷰 내용이 없습니다.");
			}
			
		}else{
			ReviewWrite(param);
		}
		
		
		
	}


	@Override
	public void ReviewWrite(int param) {		//리뷰 작성
		
		Scanner s = new Scanner(System.in);
		SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");		//오늘 일자를 불러오기 위함
		Date today = new Date();										//오늘 일자를 불러오기 위함

		ReviewVO review = new ReviewVO();
		Session user = new Session();									//사용자
		ReviewDao reviewDao = ReviewDaoImpl.getInstance(); 
		ArrayList<ReviewVO> reviewList = reviewDao.searchReviewList();
		
		int menu = 0;

		
			//리뷰 작성 부분
			System.out.println("==================================================");
			System.out.println();
			System.out.print("리뷰 내용을 작성해주세요.> ");
			
			String reviewContents = s.nextLine();
			int reviewGrade = 0;
			
			do{		//평점 1~5를 입력하지 않았을 경우 시행되는 반복문
				System.out.print("평점을 입력해주세요.(1 ~ 5)> ");
				reviewGrade = Integer.parseInt(s.nextLine());
				double reviewGrade2 = reviewGrade; 
			}while(!(reviewGrade > 0 && reviewGrade < 6));
			
			//VO 저장
			review.setWriter(Session.loginUser.getId());
			review.setBookNumber(param);
			review.setReviewNumber(reviewList.size() + 1);
			review.setContents(reviewContents);
			review.setRating(reviewGrade);
			review.setDate(ymd.format(today));
			
			this.writer = Session.loginUser.getId();			
			//Review 데이터베이스에 추가
			reviewDao.insertreview(review);
			
			this.reviewNumber = review.getReviewNumber();
			
			System.out.println();
			System.out.println("==================================================");
			System.out.println();
			System.out.println("작성자: " + review.getWriter());
			System.out.println("내용: " + review.getContents());
			System.out.println("평점: " + review.getRating());
			System.out.println("날짜: " + review.getDate());
			System.out.println();
			System.out.println("▷ 리뷰가 등록되었습니다.");
		
	}

	
	
}
	
	
