package vo;

import javax.xml.crypto.Data;

public class QNAVO {
	private int number; // 번호
	private String title; // QNA 제목 
	private String qContents; // 질문내용
	private String aContents; // 답변내용	
	private String writer; // 작성자
	private String answer;	//답변자
	private String day; // 작성 날짜, 디비에 입력되어있는 날짜 불러올때
	private Data date; // 답변날짜, 입력 또는 수정될 때 오늘날짜
	
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public Data getDate() {
		return date;
	}
	public void setDate(Data date) {
		this.date = date;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getqContents() {
		return qContents;
	}
	public void setqContents(String qContents) {
		this.qContents = qContents;
	}
	public String getaContents() {
		return aContents;
	}
	public void setaContents(String aContents) {
		this.aContents = aContents;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
