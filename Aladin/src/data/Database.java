/*
실질적인 데이터를 저장하는 장소
*/
package data;

import java.util.ArrayList;

import vo.BookVO;
import vo.FAQVO;
import vo.NoticeVO;
import vo.QNAVO;
import vo.RecentListVO;
import vo.RecentVO;
import vo.ReviewVO;
import vo.SPListVO;
import vo.UserVO;

public class Database {

	private static Database instance;
		
	private Database(){
			
	}
		
	public static Database getInstance(){
		if(instance == null)
		{
			instance = new Database();
		}
		return instance;
	}
	public ArrayList<UserVO> tb_user = new ArrayList<UserVO>();				//회원정보
	public ArrayList<BookVO> tb_bookList = new ArrayList<BookVO>();			//책 정보
	public ArrayList<ReviewVO> tb_reviewList = new ArrayList<ReviewVO>();	//리뷰
	public ArrayList<NoticeVO> tb_noticeList = new ArrayList<NoticeVO>();   //공지사항
	public ArrayList<FAQVO> tb_faqList = new ArrayList<FAQVO>(); 			//FAQ
	public ArrayList<QNAVO> tb_qnaList = new ArrayList<QNAVO>();			//QNA
	public ArrayList<SPListVO> tb_spList = new ArrayList<SPListVO>();		//장바구니
	public ArrayList<RecentVO> tb_recent = new ArrayList<RecentVO>();		//구매내역_내용
	public ArrayList<RecentListVO> tb_recentList = new ArrayList<RecentListVO>();	//구매내역_리스트
	
	//public ArrayList<HelpVO> tb_helpList = new ArrayList<HelpVO>();			//고객센터
	
	{											//회원리스트 초기화
		UserVO user = new UserVO();				//초기화 할때마다 인스턴스 객체 생성
		user.setId("admin");
		user.setPassword("admin");
		user.setName("admin");
		user.setEmail("admin@admin.com");
		user.setGrade(5);
		user.setMileage(0);
		tb_user.add(user);
		
		UserVO user2 = new UserVO();				//초기화 할때마다 인스턴스 객체 생성
		user2.setId("guest");
		user2.setPassword("guest");
		user2.setName("guest");
		user2.setEmail("guest@guest.com");
		user2.setGrade(1);							//등급은 1~5(5는 관리자)
		user2.setMileage(0);
		user2.setPhonenumber("010-1111-2222");
		tb_user.add(user2);
	}
	
	{		//20개씩 2*5*10 = 100개				//책 리스트 초기화
		BookVO book1 = new BookVO();
		book1.setTitle("제목");
		book1.setWriter("저자");
		book1.setPublisher("출판사");
		book1.setPrice(10000);			//가격
		book1.setStock(5);				//재고
		book1.setBookNumber(1);
		
		
		BookVO book2 = new BookVO();
		book2.setTitle("국내도서_과학_Do it! Node.js 프로그래밍");
		book2.setWriter("정재곤");
		book2.setPublisher("이지퍼블리싱");
		book2.setPrice(21000);			//가격
		book2.setStock(5);				//재고
		book2.setBookNumber(1);
		tb_bookList.add(book2);
		
		BookVO book3 = new BookVO();
		book3.setTitle("국내도서_인문_죽음의 부정");
		book3.setWriter("어니스트 베커");
		book3.setPublisher("한빛비즈");
		book3.setPrice(28800);			//가격
		book3.setStock(3);				//재고
		book3.setBookNumber(2);
		tb_bookList.add(book3);
		
		BookVO book4 = new BookVO();
		book4.setTitle("국내도서_문학_혼자가 혼자에게");
		book4.setWriter("이병률");
		book4.setPublisher("달");
		book4.setPrice(15500);			//가격
		book4.setStock(3);				//재고
		book4.setBookNumber(3);
		tb_bookList.add(book4);
		
		BookVO book5 = new BookVO();
		book5.setTitle("국내도서_인문_사피엔스");
		book5.setWriter("유발 하라리");
		book5.setPublisher("김영사");
		book5.setPrice(22000);			//가격
		book5.setStock(3);				//재고
		book5.setBookNumber(4);
		tb_bookList.add(book5);
		
		BookVO book6 = new BookVO();
		book6.setTitle("국내도서_경영_90년생이 온다");
		book6.setWriter("임홍택");
		book6.setPublisher("웨일북");
		book6.setPrice(14000);			//가격
		book6.setStock(3);				//재고
		book6.setBookNumber(5);
		tb_bookList.add(book6);
		
		BookVO book7 = new BookVO();
		book7.setTitle("국내도서_문학_여행의 이유");
		book7.setWriter("김영하");
		book7.setPublisher("문학동네");
		book7.setPrice(13500);			//가격
		book7.setStock(3);				//재고
		book7.setBookNumber(6);
		tb_bookList.add(book7);
		
		BookVO book8 = new BookVO();
		book8.setTitle("국내도서_문학_빨강머리 앤");
		book8.setWriter("루시 모드 몽고메리");
		book8.setPublisher("더모던");
		book8.setPrice(16800);			//가격
		book8.setStock(3);				//재고
		book8.setBookNumber(7);
		tb_bookList.add(book8);
		
		BookVO book9 = new BookVO();
		book9.setTitle("국내도서_인문_언어의 온도");
		book9.setWriter("이기주");
		book9.setPublisher("말글터");
		book9.setPrice(13800);			//가격
		book9.setStock(3);				//재고
		book9.setBookNumber(8);
		tb_bookList.add(book9);
		
		BookVO book10 = new BookVO();
		book10.setTitle("국내도서_자기계발_아주 작은 습관");
		book10.setWriter("제임스 클리어");
		book10.setPublisher("비지니스북");
		book10.setPrice(16000);			//가격
		book10.setStock(3);				//재고
		book10.setBookNumber(9);
		tb_bookList.add(book10);
		
		BookVO book11 = new BookVO();
		book11.setTitle("국내도서_문학_빛의 과거");
		book11.setWriter("은희경");
		book11.setPublisher("문학과지성사");
		book11.setPrice(14000);			//가격
		book11.setStock(3);				//재고
		book11.setBookNumber(10);
		tb_bookList.add(book11);
		
		BookVO book12 = new BookVO();
		book12.setTitle("국내도서_문학_안녕 내 모든 것");
		book12.setWriter("정이현");
		book12.setPublisher("창비");
		book12.setPrice(14800);			//가격
		book12.setStock(3);				//재고
		book12.setBookNumber(11);
		tb_bookList.add(book12);
		
		BookVO book13 = new BookVO();
		book13.setTitle("국내도서_인문_공부머리 독서법");
		book13.setWriter("최승필");
		book13.setPublisher("책그루");
		book13.setPrice(16500);			//가격
		book13.setStock(3);				//재고
		book13.setBookNumber(12);
		tb_bookList.add(book13);
		
		BookVO book14 = new BookVO();
		book14.setTitle("국내도서_인문_역사의 쓸모");
		book14.setWriter("최태성");
		book14.setPublisher("다산초당");
		book14.setPrice(15000);			//가격
		book14.setStock(3);				//재고
		book14.setBookNumber(13);
		tb_bookList.add(book14);
		
		BookVO book15 = new BookVO();
		book15.setTitle("국내도서_문학_필 때도 질 때도 동백꽃처럼");
		book15.setWriter("이해인");
		book15.setPublisher("마음산책");
		book15.setPrice(12500);			//가격
		book15.setStock(3);				//재고
		book15.setBookNumber(14);
		tb_bookList.add(book15);
		
		BookVO book16 = new BookVO();
		book16.setTitle("국내도서_경영_마케팅 때문에 고민입니다");
		book16.setWriter("이승민");
		book16.setPublisher("이코노믹북스");
		book16.setPrice(15000);			//가격
		book16.setStock(3);				//재고
		book16.setBookNumber(15);
		tb_bookList.add(book16);
		
		BookVO book17 = new BookVO();
		book17.setTitle("국내도서_인문_철학은 어떻게 삶의 무기가 되는가");
		book17.setWriter("야마구치 슈");
		book17.setPublisher("다산초당");
		book17.setPrice(16000);			//가격
		book17.setStock(3);				//재고
		book17.setBookNumber(16);
		tb_bookList.add(book17);
		
		BookVO book18 = new BookVO();
		book18.setTitle("국내도서_인문_팩트풀니스(양장본 HardCover)");
		book18.setWriter("한스 로슬링");
		book18.setPublisher("김영사");
		book18.setPrice(19800);			//가격
		book18.setStock(3);				//재고
		book18.setBookNumber(17);
		tb_bookList.add(book18);
		
		BookVO book19 = new BookVO();
		book19.setTitle("국내도서_경영_네이비씰 승리의 기술");
		book19.setWriter("조코 윌링크");
		book19.setPublisher("메이븐");
		book19.setPrice(16500);			//가격
		book19.setStock(3);				//재고
		book19.setBookNumber(18);
		tb_bookList.add(book19);
		
		BookVO book20 = new BookVO();
		book20.setTitle("국내도서_인문_당신이 옳다(들꽃 에디션)");
		book20.setWriter("정혜신");
		book20.setPublisher("해냄출판사");
		book20.setPrice(15800);			//가격
		book20.setStock(3);				//재고
		book20.setBookNumber(19);
		tb_bookList.add(book20);
		
		BookVO book21 = new BookVO();
		book21.setTitle("국내도서_자기계발_리더는 하루에 백 번 싸운다");
		book21.setWriter("요나스 요나손");
		book21.setPublisher("열린책들");
		book21.setPrice(14800);			//가격
		book21.setStock(3);	
		book21.setBookNumber(20);
		tb_bookList.add(book21);
		
		BookVO book22 = new BookVO();
		book22.setTitle("국내도서_인_개인주의자 선언");
		book22.setWriter("요나스 요나손");
		book22.setPublisher("열린책들");
		book22.setPrice(14800);			//가격
		book22.setStock(3);				//재고
		book22.setBookNumber(21);
		tb_bookList.add(book22);
		
		BookVO book23 = new BookVO();
		book23.setTitle("국내도서_인문_죽음의 수용소에서");
		book23.setWriter("빅터 프랭클");
		book23.setPublisher("열린책들");
		book23.setPrice(14800);			//가격
		book23.setStock(3);				//재고
		book23.setBookNumber(22);
		tb_bookList.add(book23);
		
		BookVO book24 = new BookVO();
		book24.setTitle("국내도서_과학_시간은 흐르지 않는다(양장본 HardCover)");
		book24.setWriter("카를로 로벨리");
		book24.setPublisher("쌤앤파커스");
		book24.setPrice(13500);			//가격
		book24.setStock(3);				//재고
		book24.setBookNumber(23);
		tb_bookList.add(book24);
		
		BookVO book25 = new BookVO();
		book25.setTitle("국내도서_경영_부의 인문학");
		book25.setWriter("브라운스톤(우석)");
		book25.setPublisher("오픈마인드");
		book25.setPrice(15000);			//가격
		book25.setStock(3);				//재고
		book25.setBookNumber(24);
		tb_bookList.add(book25);
		
		BookVO book26 = new BookVO();
		book26.setTitle("국내도서_인문_생각의 탄생");
		book26.setWriter("로버트 루트번스타인");
		book26.setPublisher("에코의 서재");
		book26.setPrice(14800);			//가격
		book26.setStock(3);				//재고
		book26.setBookNumber(25);
		tb_bookList.add(book26);
		
		BookVO book27 = new BookVO();
		book27.setTitle("국내도서_과학_이기적 유전자");
		book27.setWriter("리처드 도킨스");
		book27.setPublisher("을유문화사");
		book27.setPrice(20000);			//가격
		book27.setStock(3);				//재고
		book27.setBookNumber(26);
		tb_bookList.add(book27);
		
		BookVO book28 = new BookVO();
		book28.setTitle("국내도서_소설_핵을 들고 도망친 101세 노인");
		book28.setWriter("요나스 요나손");
		book28.setPublisher("열린책들");
		book28.setPrice(14800);			//가격
		book28.setStock(3);				//재고
		book28.setBookNumber(27);
		tb_bookList.add(book28);
		
		BookVO book29 = new BookVO();
		book29.setTitle("국내도서_과학_원더풀 사이언스");
		book29.setWriter("나탈리 앤지어");
		book29.setPublisher("사이언스");
		book29.setPrice(14800);			//가격
		book29.setStock(3);				//재고
		book29.setBookNumber(28);
		tb_bookList.add(book29);
		
		BookVO book30 = new BookVO();
		book30.setTitle("국내도서_과학_깨어남");
		book30.setWriter("올리버 색스");
		book30.setPublisher("알마");
		book30.setPrice(14800);			//가격
		book30.setStock(3);				//재고
		book30.setBookNumber(29);
		tb_bookList.add(book30);

		BookVO book31 = new BookVO();
		book31.setTitle("국내도서_인문_라틴어 수업");
		book31.setWriter("한동일");
		book31.setPublisher("흐름출판");
		book31.setPrice(14800);			//가격
		book31.setStock(3);				//재고
		book31.setBookNumber(30);
		tb_bookList.add(book31);
		
		BookVO book32 = new BookVO();
		book32.setTitle("국내도서_과학_랩 걸");
		book32.setWriter("호프 지런");
		book32.setPublisher("알마");
		book32.setPrice(17000);			//가격
		book32.setStock(3);				//재고
		book32.setBookNumber(31);
		tb_bookList.add(book32);
		
		BookVO book33 = new BookVO();
		book33.setTitle("국내도서_과학_코스모스");
		book33.setWriter("칼 세이건");
		book33.setPublisher("사이언스북스");
		book33.setPrice(17000);			//가격
		book33.setStock(3);				//재고
		book33.setBookNumber(32);
		tb_bookList.add(book33);
		
		BookVO book34 = new BookVO();
		book34.setTitle("국내도서_과학_위험한 과학책");
		book34.setWriter("랜들 먼로");
		book34.setPublisher("시공사");
		book34.setPrice(22000);			//가격
		book34.setStock(3);				//재고
		book34.setBookNumber(33);
		tb_bookList.add(book34);
		
		BookVO book35 = new BookVO();
		book35.setTitle("국내도서_과학_시간의 역사");
		book35.setWriter("스티븐 호킹");
		book35.setPublisher("까치");
		book35.setPrice(23000);			//가격
		book35.setStock(3);				//재고
		book35.setBookNumber(34);
		tb_bookList.add(book35);
		
		BookVO book36 = new BookVO();
		book36.setTitle("국내도서_과학_김상욱의 양자 공부");
		book36.setWriter("김상욱");
		book36.setPublisher("사이언스북스");
		book36.setPrice(17000);			//가격
		book36.setStock(3);				//재고
		book36.setBookNumber(35);
		tb_bookList.add(book36);
		
		BookVO book37 = new BookVO();
		book37.setTitle("국내도서_과학_스케일");
		book37.setWriter("제프리 웨스트");
		book37.setPublisher("김영사");
		book37.setPrice(30000);			//가격
		book37.setStock(3);				//재고
		book37.setBookNumber(36);
		tb_bookList.add(book37);
		
		BookVO book38 = new BookVO();
		book38.setTitle("국내도서_과학_세상을 만드는 글자,코딩");
		book38.setWriter("박준석");
		book38.setPublisher("동아시아");
		book38.setPrice(16000);			//가격
		book38.setStock(3);				//재고
		book38.setBookNumber(37);
		tb_bookList.add(book38);
		
		BookVO book39 = new BookVO();
		book39.setTitle("국내도서_과학_저도 과학은 어렵습니다만");
		book39.setWriter("이정모");
		book39.setPublisher("바틀비");
		book39.setPrice(15000);			//가격
		book39.setStock(3);				//재고
		book39.setBookNumber(38);
		tb_bookList.add(book39);
		
		BookVO book40 = new BookVO();
		book40.setTitle("국내도서_문학_돌이킬 수 없는 약속");
		book40.setWriter("야쿠마루 가쿠");
		book40.setPublisher("북플라자");
		book40.setPrice(15000);			//가격
		book40.setStock(3);				//재고
		book40.setBookNumber(39);
		tb_bookList.add(book40);
		
		BookVO book41 = new BookVO();
		book41.setTitle("국내도서_문학_나미야 잡화점의 기적");
		book41.setWriter("히가시노 게이고");
		book41.setPublisher("현대문학");
		book41.setPrice(14000);			//가격
		book41.setStock(3);				//재고
		book41.setBookNumber(40);
		tb_bookList.add(book41);
		
		BookVO book42 = new BookVO();
		book42.setTitle("국내도서_문학_바깥은 여름");
		book42.setWriter("김애란");
		book42.setPublisher("문학동네");
		book42.setPrice(12000);			//가격
		book42.setStock(3);				//재고
		book42.setBookNumber(41);
		tb_bookList.add(book42);
		
		BookVO book43 = new BookVO();
		book43.setTitle("국내도서_문학_아몬드");
		book43.setWriter("손원평");
		book43.setPublisher("창비");
		book43.setPrice(10000);			//가격
		book43.setStock(3);				//재고
		book43.setBookNumber(42);
		tb_bookList.add(book43);
		
		BookVO book44 = new BookVO();
		book44.setTitle("국내도서_문학_인간 실격");
		book44.setWriter("다자이 오사무");
		book44.setPublisher("민음사");
		book44.setPrice(5000);			//가격
		book44.setStock(3);				//재고
		book44.setBookNumber(43);
		tb_bookList.add(book44);
		
		BookVO book45 = new BookVO();
		book45.setTitle("국내도서_문학_7년의 밤");
		book45.setWriter("정유정");
		book45.setPublisher("은행나무");
		book45.setPrice(12000);			//가격
		book45.setStock(3);				//재고
		book45.setBookNumber(44);
		tb_bookList.add(book45);
		
		BookVO book46 = new BookVO();
		book46.setTitle("국내도서_자기계발_신경 끄기의 기술");
		book46.setWriter("마크 맨슨");
		book46.setPublisher("갤리온");
		book46.setPrice(13000);			//가격
		book46.setStock(3);				//재고
		book46.setBookNumber(45);
		tb_bookList.add(book46);
		
		BookVO book47 = new BookVO();
		book47.setTitle("국내도서_자기계발_말 그릇");
		book47.setWriter("김윤나");
		book47.setPublisher("카시오페아");
		book47.setPrice(11800);			//가격
		book47.setStock(3);				//재고
		book47.setBookNumber(46);
		tb_bookList.add(book47);
		
		BookVO book48 = new BookVO();
		book48.setTitle("국내도서_자기계발_어떻게 원하는 것을 얻는가");
		book48.setWriter("스튜어트 다이아몬드");
		book48.setPublisher("에이트 포인트");
		book48.setPrice(12800);			//가격
		book48.setStock(3);				//재고
		book48.setBookNumber(47);
		tb_bookList.add(book48);
		
		BookVO book49 = new BookVO();
		book49.setTitle("국내도서_자기계발_굿 라이프");
		book49.setWriter("최인철");
		book49.setPublisher("21세기북스");
		book49.setPrice(15000);			//가격
		book49.setStock(3);				//재고
		book49.setBookNumber(48);
		tb_bookList.add(book49);
		
		BookVO book50 = new BookVO();
		book50.setTitle("국내도서_자기계발_완벽한 공부법");
		book50.setWriter("고영성");
		book50.setPublisher("로크미디어");
		book50.setPrice(17800);			//가격
		book50.setStock(3);				//재고
		book50.setBookNumber(49);
		tb_bookList.add(book50);
		
		BookVO book51 = new BookVO();
		book51.setTitle("국내도서_자기계발_그릿");
		book51.setWriter("엔젤라 더크워스");
		book51.setPublisher("비지니스 북스");
		book51.setPrice(14400);			//가격
		book51.setStock(3);				//재고
		book51.setBookNumber(50);
		tb_bookList.add(book51);
		
		
		BookVO book52 = new BookVO();
		book52.setTitle("국내도서_자기계발_프레임");
		book52.setWriter("최인철");
		book52.setPublisher("21세기 북스");
		book52.setPrice(11800);			//가격
		book52.setStock(3);				//재고
		book52.setBookNumber(51);
		tb_bookList.add(book52);
		
		BookVO book53 = new BookVO();
		book53.setTitle("국내도서_경영_부의 추월차선");
		book53.setWriter("엠제이 드마코");
		book53.setPublisher("토트");
		book53.setPrice(11700);			//가격
		book53.setStock(3);				//재고
		book53.setBookNumber(52);
		tb_bookList.add(book53);
		
		BookVO book54 = new BookVO();
		book54.setTitle("국내도서_경영_초격차");
		book54.setWriter("권오현");
		book54.setPublisher("쌤앤파커스");
		book54.setPrice(16000);			//가격
		book54.setStock(3);				//재고
		book54.setBookNumber(53);
		tb_bookList.add(book54);
		
		BookVO book55 = new BookVO();
		book55.setTitle("국내도서_경영_트렌드 코리아 2019");
		book55.setWriter("김난도");
		book55.setPublisher("미래의창");
		book55.setPrice(12800);			//가격
		book55.setStock(3);				//재고
		book55.setBookNumber(54);
		tb_bookList.add(book55);
		
		BookVO book56 = new BookVO();
		book56.setTitle("국내도서_경영_원칙");
		book56.setWriter("레이 달리오");
		book56.setPublisher("한빛비즈");
		book56.setPrice(27000);			//가격
		book56.setStock(3);				//재고
		book56.setBookNumber(55);
		tb_bookList.add(book56);
		
		BookVO book57 = new BookVO();
		book57.setTitle("국내도서_경영_모두 거짓말을 한다");
		book57.setWriter("세스 스티븐스 다비도위츠");
		book57.setPublisher("더퀘스트");
		book57.setPrice(14800);			//가격
		book57.setStock(3);				//재고
		book57.setBookNumber(56);
		tb_bookList.add(book57);
		
		BookVO book58 = new BookVO();
		book58.setTitle("국내도서_경영_넛지:똑똑한 선택을 이끄는 힘");
		book58.setWriter("리처드 탈러");
		book58.setPublisher("리더스북");
		book58.setPrice(13900);			//가격
		book58.setStock(3);				//재고
		book58.setBookNumber(57);
		tb_bookList.add(book58);
	
		BookVO book59 = new BookVO();
		book59.setTitle("국내도서_경영_마케터의 일");
		book59.setWriter("장인성");
		book59.setPublisher("북스톤");
		book59.setPrice(12500);			//가격
		book59.setStock(3);				//재고
		book59.setBookNumber(58);
		tb_bookList.add(book59);
	
		BookVO book60 = new BookVO();
		book60.setTitle("국내도서_경영_블록체인 혁명");
		book60.setWriter("돈 탭스콧");
		book60.setPublisher("을유문화사");
		book60.setPrice(25000);			//가격
		book60.setStock(3);				//재고
		book60.setBookNumber(59);
		tb_bookList.add(book60);
		
		BookVO book61 = new BookVO();
		book61.setTitle("국내도서_인문_오리지널스");
		book61.setWriter("애덤 그랜트");
		book61.setPublisher("한국경제신문");
		book61.setPrice(12000);			//가격
		book61.setStock(3);				//재고
		book61.setBookNumber(60);
		tb_bookList.add(book61);
		
	}
	
	/*{											//고객센터 초기화
		HelpVO help = new HelpVO();
		help.setNumber(0);
		help.setTitle("공지사항_공지");			//공지사항, FAQ, 1:1문의 _로 구분
		help.setDay("yyyy-MM-dd");
		help.setContents("내용");
	}*/
	
	{											//리뷰 초기화
		ReviewVO review = new ReviewVO();
		review.setBookNumber(0);
		review.setWriter("작성자");
		review.setDate("yyyy-MM-dd");
		review.setRating(5.0);					//평점 5.0점 만점
		review.setContents("리뷰 내용");
		review.setReviewNumber(1);
		
		review.setBookNumber(2);
		review.setWriter("글쓴이");
		review.setDate("2018-10-20");
		review.setRating(5.0);					
		review.setContents("너무 재밌습니다.");
		review.setReviewNumber(1);
		tb_reviewList.add(review);
		
		ReviewVO review3 = new ReviewVO();
		review3.setBookNumber(2);
		review3.setWriter("정복동");
		review3.setDate("2018-05-05");
		review3.setRating(1.0);					
		review3.setContents("라면 받침대로 사용하기에 적합합니다.");
		review3.setReviewNumber(2);
		tb_reviewList.add(review3);
		
		ReviewVO review4 = new ReviewVO();
		review4.setBookNumber(1);
		review4.setWriter("천리마마트");
		review4.setDate("2019-10-14");
		review4.setRating(5.0);					
		review4.setContents("너무 재밌습니다.");
		review4.setReviewNumber(3);
		tb_reviewList.add(review4);
		
		ReviewVO review5 = new ReviewVO();
		review5.setBookNumber(1);
		review5.setWriter("문어");
		review5.setDate("2018-10-27");
		review5.setRating(3.0);					
		review5.setContents("그저 그랬어요..");
		review5.setReviewNumber(4);
		tb_reviewList.add(review5);
		
		ReviewVO review6 = new ReviewVO();
		review6.setBookNumber(4);
		review6.setWriter("아침햇살");
		review6.setDate("2017-10-01");
		review6.setRating(5.0);					
		review6.setContents("굿굿. 내용 최고!");
		review6.setReviewNumber(5);
		tb_reviewList.add(review6);
		
		ReviewVO review7 = new ReviewVO();
		review7.setBookNumber(5);
		review7.setWriter("반지의제왕");
		review7.setDate("2015-10-10");
		review7.setRating(1.0);					
		review7.setContents("내가 뭘 읽은 거지?");
		review7.setReviewNumber(6);
		tb_reviewList.add(review7);
	}
	{
		NoticeVO notice = new NoticeVO();
		notice.setWriter("작성자");
		notice.setTitle("샘플 제목");
		notice.setContents("샘플 내용");
		notice.setNumber(1); // 공지사항 순서
		notice.setDay("yyyy-MM-dd");
		
		NoticeVO notice1 = new NoticeVO();
		notice1.setWriter("admin");
		notice1.setTitle("★ [중요] 배송 공지사항 안내");
		notice1.setContents("저희 매장은 당일배송이 원칙입니다.\n기타 환불 문의는 QNA로 문의 바랍니다.");
		notice1.setNumber(2); // 공지사항 순서
		notice1.setDay("2019-10-20");
		tb_noticeList.add(notice1);
		
		NoticeVO notice2 = new NoticeVO();
		notice2.setWriter("admin");
		notice2.setTitle("★ [중요] 이벤트 관련 사항 안내");
		notice2.setContents("11월달에 굿즈 관련하여 이벤트가 있을 예정이오니, 많은 참여 바랍니다.");
		notice2.setNumber(3); // 공지사항 순서
		notice2.setDay("2019-10-23");
		tb_noticeList.add(notice2);
	}
	{
		FAQVO faq = new FAQVO();
		faq.setWriter("작성자");
		faq.setTitle("FAQ 제목");
		faq.setContents("FAQ 내용");
		faq.setNumber(1); // faq 순서
		
		faq.setWriter("admin");
		faq.setTitle("중고매장 구매상품 반품이 가능합니까?");
		faq.setContents("구매하신 일자 다음 날 부터 7일 이내 구매 매장 혹은 인근 매장에\n영수증 지참해 방문하시면 됩니다.\n(단, 매장배송 중고상품의 온라인 주문시에는 수령 후\n 20일 이내 온라인반품 신청이 가능합니다.)");
		faq.setNumber(1); // faq 순서
		tb_faqList.add(faq);
		
		FAQVO faq2 = new FAQVO();
		faq2.setWriter("admin");
		faq2.setTitle("상품이 마음에 안드는데, 다른 상품으로 교환 가능합니까?");
		faq2.setContents("다른 상품으로의 교환은 불가합니다.");
		faq2.setNumber(2); // faq 순서
		tb_faqList.add(faq2);
		
		FAQVO faq4 = new FAQVO();
		faq4.setWriter("admin");
		faq4.setTitle("품절, 절판 상품은 구입할 수 없습니까?");
		faq4.setContents("상품 페이지에 품절, 일시품절, 절판, 구판절판 등으로 표시된 상품은 현재로서는 구입하실 수 없는 상품이니 이점 양해하여 주십시오.");
		faq4.setNumber(3); // faq 순서
		tb_faqList.add(faq4);
		
		FAQVO faq5 = new FAQVO();
		faq5.setWriter("admin");
		faq5.setTitle("주문 후 입금 전(입금확인 전)인데, 언제쯤 배송됩니까?");
		faq5.setContents("저희는 주문 완료 후 당일 배송을 원칙으로 하고 있습니다.\n오전에는 배송 문의가 확인이 되지 않을 수 있으니 다음날 확인해야 하는 점 양해하여 주십시오.");
		faq5.setNumber(4); // faq 순서
		tb_faqList.add(faq5);
		
		FAQVO faq6 = new FAQVO();
		faq6.setWriter("admin");
		faq6.setTitle("중고상품 품질 등급 판정 기준은 무엇입니까?");
		faq6.setContents("'알라딘 중고상품 품질 등급 판정 가이드'에 따라 판정됩니다.\n온라인에서 팔기, 중고매장에서 팔기 공용입니다.\n중고 품질 판정 고객 위원회의 투표 결과를 반영하고 있습니다.");
		faq6.setNumber(5); // faq 순서
		tb_faqList.add(faq6);
	}
	{
		QNAVO qna = new QNAVO();
		qna.setTitle("QNA 제목");
		qna.setWriter("qna 작성자");
		qna.setAnswer("답변자");
		qna.setDay("qna 작성날짜");
		qna.setqContents("qna 내용");
		qna.setaContents("답변내용");
		qna.setNumber(1); // qna 순서
		
		qna.setTitle("책 CD 교환 가능할까요?");
		qna.setWriter("꼬랑쥐");
		qna.setAnswer("admin");
		qna.setDay("2019-08-28");
		qna.setqContents("CD가 책 내용에 들어있지 않습니다.\n교환이 가능할까요?");
		qna.setNumber(1); // qna 순서
		tb_qnaList.add(qna);
		
		QNAVO qna2 = new QNAVO();
		qna2.setTitle("책이 파손 돼서 왔는데요...");
		qna2.setWriter("해삼");
		qna2.setAnswer("admin");
		qna2.setDay("2019-08-28");
		qna2.setqContents("책의 10페이지 가량이 누락되어 있었습니다.\n교환 가능할까요?");
		qna2.setNumber(1); // qna 순서
		tb_qnaList.add(qna2);
	}
	{
		SPListVO splist = new SPListVO(); // 장바구니
		splist.setUserId("admin");
		splist.setNumber(1); // 장바구니 순서
		splist.setPrice(10000); // 장바구니 전체 가격
		splist.setStock(1); // 장바구니 구매수량
		splist.setBookNumber(1);// 장바구니에 담은 책 번호
	}
	{
		RecentVO recent = new RecentVO(); //구매내역
		recent.setStock(1);		//구매한 책 수량
		recent.setPrice(10000); // 구매 가격
		recent.setBookNumber(0);//구매한 책 번호
		recent.setRecentListNumber(0);	//참조될 내용 번호
		recent.setNumber(1);
		tb_recent.add(recent);
	}
	{
		RecentListVO recentlist = new RecentListVO(); //
		recentlist.setNumber(0);	//리스트 번호
		recentlist.setUserId("admin");
		recentlist.setDate("yyyy-MM-dd");
		recentlist.setPrice(0);
		tb_recentList.add(recentlist);
	}
}
