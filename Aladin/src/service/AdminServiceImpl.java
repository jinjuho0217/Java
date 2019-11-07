package service;

import java.util.ArrayList;

import vo.BookVO;
import vo.FAQVO;
import vo.QNAVO;
import vo.ReviewVO;
import vo.UserVO;
import dao.AdminDao;
import dao.AdminDaoImpl;

public class AdminServiceImpl implements AdminService{

		private static AdminServiceImpl instance;

		   private AdminServiceImpl() {
		   }

		   public static AdminServiceImpl getInstance() {
		      if (instance == null) {

		         instance = new AdminServiceImpl();
		      }
		      return instance;

		   }
		   AdminDao AdminDao = AdminDaoImpl.getInstance();

	@Override
	public void userView() {
		//회원 전체 목록 출력
		//회원 전체 검색
		ArrayList<UserVO> userList = AdminDao.selectUserList();

		// 출력만 해주면 됨
		System.out.println("---------------------------");
		System.out.println("번호\t아이디\t이름");
		System.out.println("---------------------------");
		for(int i=0;i < userList.size();i++){
			UserVO user = userList.get(i);
			System.out.println(i + 1 + "\t" + user.getId() + "\t" + user.getName());
		}
	}

	@Override
	public void noticeView() {
		//공지사항 전체 목록 출력
		//공지사항 전체 검색
		ArrayList<ReviewVO> reviewList = AdminDao.selectReviewList();
		//출력
		System.out.println("---------------------------");
		System.out.println("번호\t내용\t작성자\t작성날짜\t평점\t리뷰번호");
		System.out.println("---------------------------");
		for(int i=0;i < reviewList.size();i++){
			ReviewVO review = reviewList.get(i);
			System.out.println(review.getReviewNumber() + "\t" + review.getContents() + "\t" + review.getWriter()+"\t"
			+review.getDate()+"\t"+review.getRating()+"\t"+review.getReviewNumber());
			
		}
	}

	@Override
	public void faqView() {
		//FAQ 전체 목록 출력
		ArrayList<FAQVO> faqlist = AdminDao.selectFAQList();
		System.out.println("---------------------------");
		System.out.println("번호\t작성자\t제목\t내용"); // 이 순서대로 출력
		System.out.println("---------------------------");
		for(int i=0;i<faqlist.size();i++){
			FAQVO faq = faqlist.get(i);
			System.out.println(faq.getNumber() + "\t" + faq.getWriter()+ "\t" +faq.getTitle()+ "\t"+ faq.getContents());
		}
		
	}

	@Override
	public void qnaView() {
		//QNA 전체 목록 출력
		
		ArrayList<QNAVO> qnalist = AdminDao.selectQNAList();
		System.out.println("---------------------------");
		System.out.println("번호\t제목\t질문내용\t답변내용\t작성날짜\t작성자\t답변자"); // 이 순서대로 출력
		System.out.println("---------------------------");
		for(int i=0;i<qnalist.size();i++){
			QNAVO qna = qnalist.get(i);
			System.out.println(qna.getNumber() + "\t" + qna.getTitle() + "\t" + qna.getqContents()+"\t"+
			qna.getaContents()+"\t"+qna.getDate()+"\t"+qna.getWriter()+"\t"+qna.getAnswer());
		}
	}

	@Override
	public void booklistView() {
		//BookList 전체 목록 출력
		ArrayList<BookVO> booklist = AdminDao.selectBookList();
		System.out.println("---------------------------");
		System.out.println("번호\t내용\t작성자\t작성날짜\t평점\t리뷰번호");
		System.out.println("---------------------------");
		for(int i=0;i<booklist.size();i++){
			BookVO book = booklist.get(i);
			System.out.println(book.getTitle()+"\t"+book.getWriter()+"\t"+book.getPublisher()+"\t"+book.getPublisher()+
					"\t"+book.getPrice()+"\t"+book.getStock()+"\t"+book.getBookNumber());
		}
	}

	@Override
	public void reviewView() {
		// Review 전체 목록 출력
		ArrayList<ReviewVO> reviewlist = AdminDao.selectReviewList();
		System.out.println("---------------------------");
		System.out.println("번호\t내용\t작성자\t작성날짜\t평점\t리뷰번호");
		System.out.println("---------------------------");
		for(int i=0;i< reviewlist.size();i++){
			ReviewVO review = reviewlist.get(i);
			System.out.println(review.getBookNumber()+"\t"+review.getContents()+"\t"+review.getWriter()+"\t"+
			review.getDate()+"\t"+review.getRating()+"\t"+review.getReviewNumber());
		}
	}
	
}
