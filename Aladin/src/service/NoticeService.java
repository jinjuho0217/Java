package service;

public interface NoticeService {
	void noticeList(); // 공지사항 게시글 목록
	
	void noticeContent(); // 공지사항 내용 확인
	
	void noticeAdd(); // 공지사항 내용 추가(관리자 권한)
	
	void noticeDelete(); // 공지사항 내용 삭제(관리자 권한)
	
	void noticeModify(); // 공지사항 내용 수정(관리자 권한)
	
}
