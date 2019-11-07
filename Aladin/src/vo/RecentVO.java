/*
최근 구매내역
*/
package vo;

public class RecentVO {
	private String userId;	//userId 구분자1
	private int recentListNumber; // 구분자2
	private int number; // 번호	//구분자3
	private int bookNumber; // 책 번호
	private int price; // 가격
	private int stock;	// 구매한 수량
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getBookNumber() {
		return bookNumber;
	}
	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}
	public int getRecentListNumber() {
		return recentListNumber;
	}
	public void setRecentListNumber(int recentListNumber) {
		this.recentListNumber = recentListNumber;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
