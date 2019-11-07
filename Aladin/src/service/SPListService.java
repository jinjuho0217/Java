/*
작성자 : 한승희
작성날짜 : 20191022 11:11
SPListService는 장바구니 구현을 목적으로 만든 인터페이스다.
*/
package service;

public interface SPListService {
	//1.선택 2.선택해제 3.전체선택 4.전체선택해제 5.구매 6.삭제 0.이전화면
	//이전화면의 경우 Controller.java에서 구현 
	//각 기능에 대한 자세한 내용은 SPListServiceImpl.java에서 다룸.
	void select();
	
	void cancel();
	
	void allSelect();
	
	void allCancel();
	
	void buy();
	
	void delete();
	
	void viewSPList();
}
