package vo;

import java.util.Date;

public class NoticeVO {
	private int number; //구분자
	private String writer; //작성자
	private String title; // 공지사항 제목
	private String contents; // 공지사항 내용
	private Date date; // 공지 날짜 : 입력 또는 수정될 때는  오늘날짜 
	private String day; //공지날짜  : 스트링 디비에 입력되어 있는 날짜 불러올때
	


	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
