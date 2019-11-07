package dao;

import java.util.ArrayList;

import data.Database;
import vo.BookVO;
import vo.ReviewVO;

public class ReviewDaoImpl implements ReviewDao {

	
	private static ReviewDaoImpl instance;
	
	private ReviewDaoImpl(){} //생성자
	
	public static ReviewDaoImpl getInstance(){
		if(instance == null){
			instance = new ReviewDaoImpl();
		}
		return instance;
	}
	
	Database database = Database.getInstance();

	@Override
	public ArrayList<ReviewVO> searchReviewList() {		//리뷰 데이터베이스를 불러오는 메서드
		return database.tb_reviewList;
	}

	@Override
	public void insertreview(ReviewVO review) {			//리뷰 데이터베이스에 추가하는 메서드
		database.tb_reviewList.add(review);
	}
	
	
	@Override
	public void deleteList(ReviewVO review) {	//리스트 삭제 메서드
		database.tb_reviewList.remove(review);
	}
	

	@Override
	public double grade(int param) {					//리뷰 평점 평균을 구하는 메서드
		
		ArrayList<ReviewVO> reviewList = searchReviewList();
		
		double grade = 0;
		int number = 0;
		
		for(int i = 0; i < reviewList.size(); i++){		//booknumber에 맞는 평점을 구하고 평균을 구하는 메서드 
			ReviewVO review1 = reviewList.get(i);
			if(param == review1.getBookNumber()){
				grade += review1.getRating();
				 number++;
			}else{
				grade += 0;
			}
		}grade = (double)(grade / number);
		return grade;
	}
	
	
	@Override
	public String rtnBookTitle(int bookNumber) {		//해당 Booknumber에 대한 책 제목 불러오는 메서드
		//책 번호와 일치하는 책 제목을 반환한다.
		for(int i=0;i<database.tb_bookList.size();i++)
		{
			BookVO book = database.tb_bookList.get(i);
			
			if(book.getBookNumber()==bookNumber)
			{
				return book.getTitle().substring(book.getTitle().lastIndexOf('_') + 1);
				//국내도서_카테고리를 전부 불러오기 때문에 substring 추가함
			}
		}
		
		return null;
	}

	


}
