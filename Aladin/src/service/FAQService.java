package service;

public interface FAQService {
	void FAQList(); // FAQ 게시글 목록
	
	void FAQContent(); // FAQ 내용 확인
	
	void FAQAdd(); // FAQ 내용 추가(관리자 권한)
	
	void FAQDelete(); // FAQ내용 삭제(관리자 권한)
	
	void FAQModify(); // FAQ 내용 수정(관리자 권한)
}
