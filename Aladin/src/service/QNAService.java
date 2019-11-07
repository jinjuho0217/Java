package service;

public interface QNAService {
	void QNAList(); // QNA 게시글 목록
	
	void QNAContent(); // QNA 내용 확인
	
	void QNAAdd(); // QNA 내용 추가
	
	void QNADelete(); // QNA 내용 삭제(관리자 권한)
	
	void QNAModify(); // QNA 내용 수정(관리자 권한)
	
	
	
	
}
