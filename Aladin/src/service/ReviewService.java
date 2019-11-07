package service;

public interface ReviewService {

	void ReviewFind(int bookNumberparam);		//리뷰 보기
	
	void ReviewWrite(int param);		//리뷰 작성
	
	void ReviewModifyWrite(int param);		//리뷰 작성(수정)
	
}
